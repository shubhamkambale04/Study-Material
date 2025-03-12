package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OTPNotificationHandler {
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android"); // or "iOS"
		caps.setCapability("deviceName", "Pixel_4");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("app", "/path/to/app.apk");
		caps.setCapability("autoGrantPermissions", true); // Grant notification access

		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

		// Open notifications
		driver.openNotifications();

		/*
		 * // get otp from sms Process process = Runtime.getRuntime()
		 * .exec("adb shell content query --uri content://sms/inbox --projection body");
		 * BufferedReader reader = new BufferedReader(new
		 * InputStreamReader(process.getInputStream())); String line; while ((line =
		 * reader.readLine()) != null) { if (line.contains("Your OTP")) { return; //
		 * Extract numeric OTP } }
		 * 
		 */
		// Fetch OTP from notification text
		WebElement notification = driver.findElement(By.id("android:id/message"));
		String message = notification.getText();
		System.out.println("Notification Message: " + message);

		// Extract OTP using regex
		String otp = message.replaceAll("[^0-9]", "");
		System.out.println("Extracted OTP: " + otp);

		// Enter OTP in the application
		driver.findElement(By.id("com.example.app:id/otpField")).sendKeys(otp);

		driver.quit();
	}
}
