
package seleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Screenshot extends Browser {

	@Test
	void screenshot() throws IOException {
		// typeCasting
		TakesScreenshot ts = (TakesScreenshot) driver;

		String path = "";

		// takes screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);

		// copy from src and save it in dest
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}
}
