package android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HandleContext {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android"); // or "iOS"
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("app", "C:/Users/HP/Downloads/myApp.apk");

		// Initialize Driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
        
		// Print all available contexts
		Set<String> contextNames = driver.getContextHandles();
		System.out.println("Available Contexts: " + contextNames);

		// Switch to WebView
		String name="WEBVIEW";
		for (String context : contextNames) {
			if (context.contains(name)) {
				driver.context(context);
				break;
			}
		}

		// Perform WebView actions
		driver.findElement(By.id("username")).sendKeys("testuser");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("login")).click();

		// Switch back to Native App
		driver.context("NATIVE_APP");

		// Close the driver
		driver.quit();
	}
}
