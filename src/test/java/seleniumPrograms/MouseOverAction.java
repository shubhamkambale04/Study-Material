package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseOverAction extends Browser {

	// MoveToElement
	@Test
	public void mouseAction() {

		driver.get("https://www.amazon.in/");

		// Initialize Actions class
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Perform mouse hover
		WebElement source = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action.moveToElement(source).perform();

		// Wait for "Your Orders" to be clickable
		WebElement target = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Your Orders']")));

		// Click on "Your Orders"
		action.moveToElement(target).click().build().perform();

		System.out.println("Clicked on 'Your Orders' successfully.");
	}

	// ContextClick
	@Test
	public void rightClick() {

		// Visiting the URL
		driver.get("https://www.softwaretestingmentor.com/automation-practice-page-right-click-demo/");

		//Maximise browser window
		driver.manage().window().maximize();

		//Instantiating the Actions Class
		Actions actions = new Actions(driver);

		// Fetching or locating WebElement to perform right-click using the desired locators
		WebElement btnElement = driver.findElement(By.xpath("//h1[contains(text(),'Automation Practice Page – Right Click Demo')]"));

		//Right click the button to display Context Menu
		actions.contextClick(btnElement).perform();

		System.out.println("Context Menu displayed");

		// Code To click on a specific option from the Context menu once right-click is performed.
		WebElement elementOpen = driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-8 awaken-content-float']//li[1]")); 
		elementOpen.click();

		// Accept the Alert
		driver.switchTo().alert().accept();

		System.out.println("Right click Alert Accepted Successfully ");

	}

	// double Click
	@Test
	public void doubleClick() {

		driver.get("https://www.amazon.in/");

	}

	// Drag and Drop
	@Test
	public void dragAnddrop() {

		driver.get("https://www.amazon.in/");

	}

}
