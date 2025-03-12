package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdown extends Browser {

    @Test
    public void selectDropdown() {
        WebElement dropdown = driver.findElement(By.id("Tools"));

        // Select dropdown option
        Select s = new Select(dropdown);
        s.selectByVisibleText("JIRA");
        s.selectByValue("Jira");
        s.selectByIndex(1);

        // Deselect (if it's a multi-select dropdown)
        s.deselectAll();
    }
}
