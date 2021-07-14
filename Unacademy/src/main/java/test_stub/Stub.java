package test_stub;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Stub
	{
		public static void moverOver(WebDriver driver) throws InterruptedException {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3200)");
		    Actions act = new Actions(driver);
		    Thread.sleep(3000);
		    act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'LeaderBlock__Face')]//child::div[1]"))).build().perform();
			
		}
		
	    public static void main( String[] args ) throws InterruptedException, AWTException
	    { 
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/java/drivers/chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://unacademy.com/about");
	        driver.manage().window().maximize();


	    String text2 = driver.findElement(By.xpath("//span[contains(text(),'50M')]")).getText();  
        System.out.println("Test 1 Passes - Fetched live Value of active learners -> " +text2);

	    String text3 = driver.findElement(By.xpath("//span[contains(text(),'1000')]")).getText();
	    System.out.println("Test 2 Passes - Fetched live Value of active learners -> " +text3);

	    String text4 = driver.findElement(By.xpath("//span[contains(text(),'1B')")).getText();
	    System.out.println("Test 3 Passes - Fetched live Value of active learners -> " +text4);
	    
	    String text5 = driver.findElement(By.xpath("//span[contains(text(),'2000')")).getText();
	    System.out.println("Test 4 Passes - Fetched live Value of active learners -> " +text5);
	    
	 
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
	//    WebElement Element = driver.findElement(By.linkText(""));
    //    js.executeScript("arguments[0].scrollIntoView();", Element);  // yaha tak wala scroll karta hai
      
	    WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'See open postions')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));

        driver.findElement(By.xpath("//a[@href='/unacademy/j/614A9AD6C8/']")).click();
        Thread.sleep(1600);

        driver.findElement(By.xpath("//a[@href='/unacademy/j/614A9AD6C8/apply/']")).click();
        Thread.sleep(1600);

        driver.findElement(By.id("firstname")).sendKeys("testfirst"); //first name
	    driver.findElement(By.id("lastname")).sendKeys("testlast"); //last name
	    driver.findElement(By.id("email")).sendKeys("testtest@test.com"); // email
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6683565356");
	    driver.findElement(By.id("CA_5516")).sendKeys("testcity"); // city
	        
	    driver.findElement(By.xpath("//input[@role='combobox']")).click();
        driver.findElement(By.xpath("//span[text()='0-1']")).click();
        
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
        
        
	    driver.findElement(By.xpath("//input[@name='CA_5513']")).sendKeys("31.42"); //salary
	        
	    driver.findElement(By.xpath("//button[text() ='Submit application']")).click();
	    
        Thread.sleep(2000);

		driver.navigate().to("https://www.unacademy.com/about");
		Thread.sleep(2500);
		
	
        Actions act = new Actions(driver);
        //hover to tech
    	  moverOver(driver);

        //act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'LeaderBlock__Face')]//child::div[1]"))).build().perform();
     
		Thread.sleep(1500);
		 //Actions act2 = new Actions(driver);
	     //hover to tech
	     act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'LeaderBlock__Face')]//child::div[2]"))).build().perform();
			
	    Thread.sleep(1500);
	   // Actions act3 = new Actions(driver);
        //hover to tech
        act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'LeaderBlock__Face')]//child::div[3]"))).build().perform();
		
		
		
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.unacademy.com/about");

		
		String unexpectedTitle;
		unexpectedTitle = "Unacademy (@unacademy) • Instagram photos and videos";
		Assert.assertEquals(driver.getTitle(),unexpectedTitle);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.youtube.com/channel/UCABe2FgVNv2hgBeMu2mySVg");
		String inexpectedTitle;
		inexpectedTitle = "Let's Crack UPSC CSE - YouTube";
		Assert.assertEquals(driver.getTitle(),inexpectedTitle);
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
	    //WebElement ele = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/main/form/button"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", ele); 
        
	    
	  /*  Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA"); drop down wala */
		
	   
        /*Thread.sleep(5000);
        driver.get("https://unacademy.com/about");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement Element1 = driver.findElement(By.linkText(""));
        js1.executeScript("arguments[0].scrollIntoView();", Element1); */
        
       /* WebElement ele = driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[3]/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
        Thread.sleep(2500); */
      

	   // driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/");
	   //driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/apply/");
	   // driver.findElement(By.xpath("//div[@id='careers-jobs-list-styles__link--3qpm9']//a[@href='/unacademy/j/2CD4FCB2CB/']")).click();
	   //  driver.findElement(By.xpath("//div[@id='app']//a[@class='careers-jobs-list-styles__link--3qpm9']")).click();

        
  /*    WebElement ele = driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/div[4]/div/div/div[1]"));

      //Creating object of an Actions class
      Actions action = new Actions(driver);

      //Performing the mouse hover action on the target element.
      action.moveToElement(ele).perform();*/

      
	   // driver.quit();

	    }
	}
