package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Browser {
	
	@Test
	public void enterTextUsingJS() {

		// Create JavaScriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down the webpage by 5000 pixels
		js.executeScript("scrollBy(0, 5000)");

		// Locate the search box
		WebElement searchBox = driver.findElement(By.name("q"));
		// Enter text using JavaScript
		js.executeScript("arguments[0].value='Selenium WebDriver'", searchBox);

		// Locate the search box
		WebElement btnLogin = driver.findElement(By.name("q"));
		// for button click
		js.executeScript("arguments[0].click()", btnLogin);

		// Locate & scroll the text
		WebElement textScroll = driver.findElement(By.name("q"));
		// Scroll down
		js.executeScript("arguments[0].scrollIntoView(false)", textScroll);
		// Scroll up
		js.executeScript("arguments[0].scrollIntoView(true)", textScroll);

		// Locate the text box
		WebElement textEmail = driver.findElement(By.id("email"));
		// Enter text using JavaScript by setAttribute
		js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", textEmail);
		// Retrive text using JavaScript by getAttribute
		js.executeScript("arguments[0].getAttribute('value')", textEmail);
	}


}
