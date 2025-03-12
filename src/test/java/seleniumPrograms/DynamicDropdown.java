package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class DynamicDropdown {
    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Open the webpage with the dynamic dropdown
            driver.get("https://example.com"); // Replace with actual URL

            // Locate and click the dropdown to expand options
            WebElement dropdown = driver.findElement(By.id("dropdownId")); // Change ID as per your HTML
            dropdown.click();

            // Wait until the dropdown options are loaded
            List<WebElement> options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='dropdown-list']//li"))); 

            // Loop through options and select the desired one
            String valueToSelect = "OptionText"; // Change this to the value you want to select
            for (WebElement option : options) {
                if (option.getText().equalsIgnoreCase(valueToSelect)) {
                    option.click();
                    break;
                }
            }

            // Additional actions after selection

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
