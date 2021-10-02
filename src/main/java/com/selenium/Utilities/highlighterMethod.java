package com.selenium.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class highlighterMethod {
	//To highlight the actions on webpage
	public static void highlight(WebDriver driver, WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: Red; border: 2px solid Black;');", element);
	}
}
