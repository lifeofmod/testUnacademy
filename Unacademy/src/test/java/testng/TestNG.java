package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.unacademy.library.ExcelUtility;

import library.Utility;
import pagefact.PageFile;

public class TestNG {

	WebDriver driver;
	public Utility util = new Utility();
	PageFile PF;
	String text1;
	String text2;
	String text3;
	String text4;
	String expectedTitle;
	public ExcelUtility excelutil = new ExcelUtility();

	@BeforeMethod
	public void launchPage() throws IOException {
		 System.setProperty(util.getWebDriver(),util.getExecutor());
		 driver= new ChromeDriver();
		 driver.get(util.getBaseUrl());
		 driver.manage().window().maximize();
		 System.out.println("User is directed to Unacademy page");
		 PF = new PageFile(driver);
	}
	
	@Test(priority = 1)
    public void fourValues() {
		 
		 text1 = PF.firstText();
		 text2 = PF.secondText();
		 text3 = PF.thirdText();
		 text4 = PF.fourthText();
		 
		 System.out.println("Test 1 Passes - Fetched live Value of active learners -> " +text1);
		 System.out.println("Test 2 Passes - Fetched live Value of top educators -> " +text2);
		 System.out.println("Test 3 Passes - Fetched live Value of minutes watched -> " +text3);
		 System.out.println("Test 4 Passes - Fetched live Value of daily live classes -> " +text4);
	}
	
	@DataProvider(name ="TestData")
    public Object[][] excelDP1() throws IOException
    {
        //We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
        Object[][] arrObj =excelutil.getExcelData(util.getExcelSheetPath(),util.getExcelSheet1Name());
        return arrObj;
    }
	
	@Test(priority = 2, dataProvider = "TestData")
    public void applyPostings(String firstname, String lastname, String mail, String city, String phnno, String recentsalary) {
		PF.openPosClick();

		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        
        PF.buttonAfterThatClick();
        
        PF.applyClick();
        
		PF.firstEnter(firstname);

		PF.lastEnter(lastname);

		PF.emailEnter(mail);
		
		PF.enterPhoneNo(phnno);

		PF.cityEnter(city);		

		PF.dropDownOpen();
	        
	    PF.dropDownSelect();
	    
	    PF.uploadFileBrowser();
	    
        PF.salaryEnter(recentsalary);

        PF.regButtonClick();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	}
	
	@Test(priority = 3)
    public void hoverOver() {
		PF.firstFounderText();
		PF.secondFounderText();
		PF.thirdFounderText();
	}
	
	@Test(priority = 4)
    public void visitPages() {
	    
	    expectedTitle = "Unacademy (@unacademy) • Instagram photos and videos";
		System.out.println(driver.getTitle());
	    PF.instButton();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		

	    expectedTitle = "Unacademy | LinkedIn";
		System.out.println(driver.getTitle());
	    PF.lnButton();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}
