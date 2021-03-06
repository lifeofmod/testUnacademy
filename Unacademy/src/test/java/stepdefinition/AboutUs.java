package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.Utility;
import pagefact.PageFile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AboutUs {
	
	public static WebDriver driver;
	public Utility util = new Utility();
	String text1;
	String text2;
	String text3;
	String text4;
	String expectedTitle;
	PageFile PF;

	
	@Given("User is on about us Unacademy page")
	public void invokeBrowser() throws IOException {
		 System.setProperty(util.getWebDriver(),util.getExecutor());
		 driver= new ChromeDriver();
		 driver.get(util.getBaseUrl());
		 driver.manage().window().maximize();
		 System.out.println("User is directed to Unacademy page");
		 PF = new PageFile(driver);
	}

	@When("Seek the numeric value for all four categories")
	public void fetchAllValues () {
		text1 = PF.firstText();
	    text2 = PF.secondText();
	    text3 = PF.thirdText();
	    text4 = PF.fourthText();
	}

	@Then("Live Numeric value found for all four categories")
	public void showAllValues() {
		System.out.println("Test 1 Passes - Fetched live Value of active learners -> " +text1);
	    System.out.println("Test 2 Passes - Fetched live Value of top educators -> " +text2);
	    System.out.println("Test 3 Passes - Fetched live Value of minutes watched -> " +text3);
	    System.out.println("Test 4 Passes - Fetched live Value of daily live classes -> " +text4);
	    driver.quit();
	}

	@When("User clicks on button open position")
	public void clickOpenPositions() throws InterruptedException {
		PF.openPosClick();
	}

	@When("User clicks on any one of the options")
	public void clickJobOptions() {
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        
        PF.buttonAfterThatClick();
        
        PF.applyClick();

	}

	@When("User enters firstname as {string}")
	public void fillFirst(String firstname) {
		PF.firstEnter(firstname);
	}
	
	@When("User enters lastname as {string}")
	public void fillLast(String lastname) {
		PF.lastEnter(lastname);

	}

	@When("User enters email as {string}")
	public void fillEmail(String mail) {
		PF.emailEnter(mail);
	}

	@When("User enters phone number as {string}")
	public void fillPhone(String phnno) {
		PF.enterPhoneNo(phnno);
	}

	@When("User enters location as {string}")
	public void fillCity(String city) {
		PF.cityEnter(city);		
	}

	@When("User selects value from dropdown")
	public void selectDropdown() {
        PF.dropDownOpen();
        
        PF.dropDownSelect();
  
	}
	
	@When("User uploads Resume as a pdf")
	public void uplaodFileFromBrowser() throws AWTException {
       PF.uploadFileBrowser();
       Robot rb = new Robot();
       StringSelection str = new StringSelection("D:\\Downloads\\blank.pdf");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
      
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
      
       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);
      
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User enters most recent salary as {string}")
	public void enterSalary(String recentsalary) {
        PF.salaryEnter(recentsalary);
	}
	
	@Then("User clicks on Submit Application button")
	public void submitApplication() {
		PF.regButtonClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
	}

	@When("Hovered over all of them indivisually")
	public void hoverMouse() {
		PF.firstFounderText();
		PF.secondFounderText();
		PF.thirdFounderText();
	}

	@Then("Names are displayed")
	public void textRevealed() {
	    System.out.println("Information in text Displayed");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
	}

	@When("Click on instagram button")
	public void visitInstPage() {
	    PF.instButton();
	}

	@Then("Redirected to instagram page")
	public void verifyInstPage() {
		PF.instVerif();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}

	@Then("Click on LinkedIn button")
	public void visitlnPage() {
	    PF.lnButton();
	}

	@Then("Redirected to LinkedIn page of Unacademy")
	public void verifylnPage() {
		PF.lnverify();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
	}

	
	
	
	
}
