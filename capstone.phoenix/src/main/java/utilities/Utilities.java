package utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
//import junit.framework.Assert;
//import org.junit.Assert;

public class Utilities extends Base{
	
	public static WebDriverWait wait;
	
	@SuppressWarnings("deprecation")
	public static void waitAndClickElement(WebElement element) {
		boolean clicked = false;
		int attempts = 0;
		while(!clicked && attempts < 10) {
			try {
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			System.out.println("Successfully clicked on the WebElement: " + "=" + element.toString());
			clicked = true;
			} catch (Exception e) {
				try {
					logger.info("Failed to click the element");
				} catch (Exception e2) {
				}
			//	Assert.fail("Unable to click the element: " + "=" +  element.toString());
			}	
		attempts++;
		}	
	}
	
	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}


	// method for taking screenshots
	public static void takeScreenShot(String fileName) throws IOException {
	
		String path = ".\\output\\screenShots\\";
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}

	// if the .click() does not work, then we get the help JSExecuter
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// How we can give border to an element on webpage
	public static void highlightelementRedBorder(WebElement element) throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	// How we can give border to an element on webpage and take screenshot
	public static void highlightelementRedBorderAndTakeScreenshot(WebElement element, String fileName) throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.takeScreenShot(fileName);
	}

	// How we can highlight an element background
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}

	// What if we want to do both/above with same method?
	// give border and highlith
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	// How we can scroll down the page with JSExecutor
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// how to sendkeys with JSExecutor
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}

	//scroll up the page
	public static void scrollUpPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
	}



}
