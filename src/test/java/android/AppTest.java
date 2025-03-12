package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class AppTest {

	public static AppiumDriver driver;

	@BeforeClass
	 public void setUp() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("PLATFORM_NAME", "Android");
		caps.setCapability("DEVICE_NAME", "emulator-5554"); // Change if using a real device
		caps.setCapability("AUTOMATION_NAME", "UiAutomator2");
		caps.setCapability("BROWSER_NAME", "Chrome");
		caps.setCapability("NEW_COMMAND_TIMEOUT", 60);


		// Initialize AndroidDriver
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
	}

	@Test
	public void testGoogleSearch() {
		// Handle Chrome initial setup (if shown)

		WebElement acceptButton = driver.findElement(By.id("com.android.chrome:id/signin_fre_dismiss_button"));
		acceptButton.click();
		WebElement noThanks = driver.findElement(By.id("com.android.chrome:id/negative_button"));
		noThanks.click();
		System.out.println("Chrome Browser Started on Emulator!");

		driver.get("https://www.google.com");

		// Wait for the search bar and input query
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Appium Automation");
		searchBox.submit();

		// Wait for search results
		WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
		System.out.println("Search Result: " + firstResult.getText());
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			System.out.println("Test Completed and Browser Closed.");
		}
	}
}
