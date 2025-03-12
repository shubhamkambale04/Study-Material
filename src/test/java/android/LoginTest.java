package android;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class LoginTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4");
        caps.setCapability("appPackage", "com.example.myapp");
        caps.setCapability("appActivity", "com.example.myapp.LoginActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

        driver.findElement(By.id("com.example:id/username")).sendKeys("testuser");
        driver.findElement(By.id("com.example:id/password")).sendKeys("password123");
        driver.findElement(By.id("com.example:id/button_login")).click();

        // Validate login success
        String message = driver.findElement(By.id("com.example:id/welcomeText")).getText();
        if (message.contains("Welcome")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }

        driver.quit();
    }
}
