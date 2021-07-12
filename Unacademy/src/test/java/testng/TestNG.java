package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagefact.PageFile;

public class TestNG {

	WebDriver driver;
	PageFile PF;
	String text1;
	String text2;
	String text3;
	String text4;
	String expectedTitle;

	@BeforeTest
	public void launchPage() {
		driver.get("https://unacademy.com/about");
		driver.manage().window().maximize();
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
	
	@Test(priority = 2, dataProvider = "")
    public void applyPostings() {
		PF.openPosClick();

		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        /*
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
        */
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

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
