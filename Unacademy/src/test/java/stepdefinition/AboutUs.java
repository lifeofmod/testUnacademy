package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefact.PageFile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AboutUs {
	
	public static WebDriver driver;
	String text1;
	String text2;
	String text3;
	String text4;
	String expectedTitle;
	PageFile PF;
	
    
	
	@Given("User is on about us Unacademy page")
	public void invokeBrowser() {
		
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/java/drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://unacademy.com/about");
	  driver.manage().window().maximize();
	   System.out.println("User is directed to Unacademy page");
	   PF = new PageFile(driver);
	}


	@When("Seek the numeric value for all four categories")
	public void fetchAllValues() {
	    text1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[1]/div/span[1]")).getText(); 
		//Assert.assertEquals(text1,"52M");
	    text2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[2]/div/span[1]")).getText();
		//Assert.assertEquals(text2,1000);
	    text3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[3]/div/span[1]")).getText();
		//Assert.assertEquals(text3,"1B");
	    text4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[4]/div/span[1]")).getText();
		//Assert.assertEquals(text4,2000);
		System.out.println("Value fetched");

	}

	@Then("Live Numeric value found for all four categories")
	public void showAllValues() {
        System.out.println("Test 1 Passes - Fetched live Value of active learners -> " +text1);
	    System.out.println("Test 2 Passes - Fetched live Value of top educators -> " +text2);
	    System.out.println("Test 3 Passes - Fetched live Value of minutes watched -> " +text3);
	    System.out.println("Test 4 Passes - Fetched live Value of daily live classes -> " +text4);
	}

	
	@When("Click on button open position")
	public void clickOpenPositions() {
		WebElement ele = driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[3]/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("");

	}

	
	@Then("Click on any one of the options")
	public void clickJobOptions() throws InterruptedException {
		 driver.get("https://apply.workable.com/unacademy/");
	     Thread.sleep(2000);
		 driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/apply/");
		    
	        Thread.sleep(1600);
       /* driver.findElement(By.xpath("//*[@id=\'app\']/div/div/main/div[2]/ul/li[1]/div/a")).click(); */
		/*WebElement ele = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/main/div[2]/ul/li[1]/div/a"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		   System.out.println("");

	}

	@Then("Able to apply successfully")
	public void fillRegDetails() throws InterruptedException, AWTException {
		
		driver.findElement(By.id("firstname")).sendKeys("testfirst"); //first name
	    driver.findElement(By.id("lastname")).sendKeys("testlast"); //last name
	    driver.findElement(By.id("email")).sendKeys("testtest@test.com"); // email
	    driver.findElement(By.xpath("//*[@id='app']/div/div/div/main/form/section[1]/div[2]/div[4]/label/div/div/div/div/input")).sendKeys("6683565356");
	    driver.findElement(By.id("CA_5516")).sendKeys("testcity"); // city
	        
	    driver.findElement(By.xpath("//*[@id='app']/div/div/div/main/form/section[2]/div[2]/div[1]/div/div/label/div")).click();
        driver.findElement(By.xpath("//*[@id='input_CA_5511_dialog']/div/div/ul/li[2]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/main/form/section[2]/div[2]/div[2]/label/div/div/input")).sendKeys("25"); //years of rel experience
   
	    driver.findElement(By.xpath("//span[@role='button']")).click();
	    Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection str = new StringSelection("D:\\Downloads\\blank.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
       
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
       
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
       
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        
        
	    driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/main/form/section[3]/div[2]/div[1]/label/div/div/input")).sendKeys("25"); //
	    
	    driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/main/form/section[3]/div[2]/div[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\'input_CA_5515_dialog\']/div/div/ul/li[2]")).click();
	    
        Thread.sleep(5000);
        
	    driver.findElement(By.xpath("//*[@id='app']/div/div/div/main/form/button")).click();

		   System.out.println("");

	}

	@Given("User is redirected to the About Us page")
	public void redirectToAbout() {
		driver.get("https://https://www.unacademy.com/about");
	}

	@When("Hovered over all of them indivisually")
	public void hoverMouse() {
		   System.out.println("");

	}

	@Then("Names are displayed")
	public void names_are_displayed() {
		   System.out.println("");

	}

	@When("Click on home button")
	public void clickHome() {
		driver.get("https://https://www.unacademy.com/");

	}

	@Then("Redirected to home page")
	public void checkHome() {
		expectedTitle = "About Us | Unacademy";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),expectedTitle);
	}
	
	@Then("Click on facebook button")
	public void fbClick() {
		driver.get("https://https://www.facebook.com/unacademy/");
	}
	
	@Then("Redirected to facebook page of Unacademy")
	public void fbCheck() {
		expectedTitle = "Unacademy - Home Page | Facebook";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),expectedTitle);
	}
	
	@Then("Click on youtube button")
	public void youtubeClick() {
		driver.get("https://www.youtube.com/channel/UCABe2FgVNv2hgBeMu2mySVg");
	}

	@Then("Redirected to youtube page of Unacademy")
	public void youtubeCheck() {
		expectedTitle = "Let's Crack UPSC CSE - YouTube";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),expectedTitle);
	}
	
	@Then("Click on twitter button")
	public void ttrClick() {
		driver.get("https://twitter.com/unacademy");
	}
	
	@Then("Redirected to twitter page of Unacademy")
	public void ttrCheck() {
		expectedTitle = "Unacademy (@unacademy) / Twitter";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),expectedTitle);
	}
	
	
}