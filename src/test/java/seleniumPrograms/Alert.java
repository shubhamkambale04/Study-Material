package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends Browser {

	@Test
	void alert() {

		// Trigger an alert (Example: clicking a button that opens an alert)
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.getText();
		a.sendKeys("test");
	}

}
