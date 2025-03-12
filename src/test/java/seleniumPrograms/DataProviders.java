package seleniumPrograms;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends Browser {
	
	// by providing direct data
	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		return new Object[][] { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" } };
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String username, String password) {
		System.out.println("Testing with Username: " + username + " and Password: " + password);
		// Add your login test logic here
	}

	// by using excel file
	@DataProvider(name = "LoginData")
	public String[][] getAllData() throws IOException {
		String path = ".\\TestData\\login data driven test.xlsx"; // Ensure correct path

		ExcelUtility excelData = new ExcelUtility(path);
		int rowCount = excelData.getRowCount("Sheet1");
		int colCount = excelData.getCellCount("Sheet1", 1); // Assuming row 1 contains data
		String[][] loginData = new String[rowCount - 1][colCount]; // Exclude header row

		// Populate data from Excel
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				loginData[i - 1][j] = excelData.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
	}
}
