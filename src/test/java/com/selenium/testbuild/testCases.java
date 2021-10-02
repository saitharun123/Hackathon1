package com.selenium.testbuild;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.selenium.Pages.DriverSetup;
import com.selenium.Test.urbanLadder;
//import com.selenium.Pages.browserSetup;
import com.selenium.Utilities.extentReport;


public class testCases {
	
	ExtentReports report = extentReport.getReportInstance();
	
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {

		//driver = browserSetup.DriverSetup();
		driver = DriverSetup.getDriver();

	}
	@BeforeTest
	public void url(){
		
		new urbanLadder(driver);
		
	}
	
	@Test (priority = 0, groups={"Smoke Test"})
	public void aaavalidateHomePage(){
		ExtentTest logger = report.createTest("Validating HomePage", "Test 1");
		logger.log(Status.INFO, "Test for Homepage Validation");
		new urbanLadder(driver);
		//logger.info("This will close the popup window");
		urbanLadder.homePage();
		logger.pass("Passed");
		
	}
	
	@Test (priority = 2, groups={"Smoke Test"})
	public void bbbvalidateBookshelvesPage() throws Exception{
		ExtentTest logger = report.createTest("Validating Booksheleves Page", "Test 4");
		logger.log(Status.INFO, "Test for Booksheleves Page Validation");
		new urbanLadder(driver);
		urbanLadder.bookshelvesPage();
		logger.pass("Passed");
	}
	
	//TestCase to close the popup window
	@Test (priority = 1, groups={"Smoke Test"})
	public void popup() throws Exception {
		ExtentTest logger = report.createTest("Closing Popup", "Test 2");
		logger.log(Status.INFO, "Test for closing Popup");
		new urbanLadder(driver);
		logger.info("This will close the popup window");
		urbanLadder.closePopup();
		logger.pass("Passed");
	}
	
	//TestCase to Open the Booksheleves
	@Test (priority = 3, groups={"Regression Test"})
	public void bookshelves() throws Exception {
		ExtentTest logger = report.createTest("Open Bookshelves", "Test 3");
		logger.log(Status.INFO, "Test for opening bookshelevs");
		new urbanLadder(driver);
		logger.info("Redirected to booksheleves page");
		urbanLadder.clickBookshelves();
		logger.pass("Passed");
	}
	
//	@Test (priority = 3, groups={"Smoke Test"})
//	public void validateBookshelvesPage(){
//		ExtentTest logger = report.createTest("Validating Booksheleves Page", "Test 4");
//		logger.log(Status.INFO, "Test for Booksheleves Page Validation");
//		new urbanLadder(driver);
//		//logger.info("This will close the popup window");
//		urbanLadder.bookshelvesPage();
//		logger.pass("Passed");
//	}
		
	
	//TestCase to Select the storage type from dropdown
	@Test (priority = 4, groups={"Regression Test"})
	public void storage() throws Exception {
		ExtentTest logger = report.createTest("Select storage type", "Test 5");
		logger.log(Status.INFO, "Test for selecting bookshelves");
		new urbanLadder(driver);
		logger.info("Storage type open is selected");
		urbanLadder.storageType();
		logger.pass("Passed");
	}
	
	//TestCase to select the price range
	@Test (priority = 5, groups={"Regression Test"})
	public void slider() throws Exception {
		ExtentTest logger = report.createTest("Adjust slider", "Test 6");
		logger.log(Status.INFO, "Test for moving slider");
		new urbanLadder(driver);
		logger.info("Price adjusted within range");
		urbanLadder.priceSlider();
		logger.pass("Passed");
	}
	
	//TestCase to enable the check box for exclude out of box items
	@Test (priority = 6, groups={"Regression Test"})
	public void checkbox() throws Exception {
		ExtentTest logger = report.createTest("Exclude - Checbox", "Test 7");
		logger.log(Status.INFO, "Test for enabling checkbox");
		new urbanLadder(driver);
		logger.info("Checkbox enabled");
		urbanLadder.excludeCheckbox();
		logger.pass("Passed");
	}
	
	//TestCase to print the first three items
	@Test (priority = 7, groups={"Regression Test"})
	public void printItems() throws Exception {
		ExtentTest logger = report.createTest("Print first three items", "Test 8");
		logger.log(Status.INFO, "Test for printing items");
		new urbanLadder(driver);
		logger.info("Items printed");
		urbanLadder.printFirstThree();
		logger.pass("Passed");
	}
	
	//TestCase to print the collection items
	@Test (priority = 8, groups={"Regression Test"})
	public void collections() throws Exception {
		ExtentTest logger = report.createTest("Collections", "Test 9");
		logger.log(Status.INFO, "Test for collections");
		new urbanLadder(driver);
		logger.info("Options displayed");
		urbanLadder.collections();
		logger.pass("Passed");
	}
	
	//TestCase to retrive submenu list
	@Test (priority = 9, groups={"Regression Test"})
	public void printSubmenu() throws Exception {
		ExtentTest logger = report.createTest("Sub menu - New Arrivals", "Test 10");
		logger.log(Status.INFO, "Test for Retriving submenu list");
		new urbanLadder(driver);
		logger.info("Listed the options");
		urbanLadder.printOptions();
		logger.pass("Passed");
	}
	
	@Test (priority = 10, groups="Smoke Test")
	//@Test(enabled=false)
	public void validateGiftCardPage() throws Exception{
		ExtentTest logger = report.createTest("Validating Giftcard Page", "Test 11");
		logger.log(Status.INFO, "Test for Giftcard Page Validation");
		new urbanLadder(driver);
		//logger.info("This will close the popup window");
		urbanLadder.clickGiftcards();
		logger.pass("Passed");
	}
	
		
	@Test (priority = 11, groups="Regression Test")
	//@Test(enabled=false)
	public void giftCard() throws Exception {
		ExtentTest logger = report.createTest("Giftcards", "Test 12");
		logger.log(Status.INFO, "Test for filling form and validate");
		new urbanLadder(driver);
		logger.info("Validation done");
		urbanLadder.giftcards();
		logger.pass("Passed");
	}
	
	//Closing the browser
	@AfterSuite
	public void closeBrowser() {
		
		report.flush();

		driver.quit();
	}

}
