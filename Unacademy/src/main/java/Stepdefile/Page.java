package Stepdefile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Page
	{
	    public static void main( String[] args ) throws InterruptedException, AWTException
	    { 
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/java/drivers/chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://unacademy.com/about");
	        driver.manage().window().maximize();


	    String text2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[1]/div/span[1]")).getText();  
        System.out.println("Test 1 Passes - Fetched live Value of active learners -> " +text2);

	    String text3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[2]/div/span[1]")).getText();
	    System.out.println("Test 2 Passes - Fetched live Value of active learners -> " +text3);

	    String text4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[3]/div/span[1]")).getText();
	    System.out.println("Test 3 Passes - Fetched live Value of active learners -> " +text4);
	    
	    String text5 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[2]/div[4]/div/span[1]")).getText();
	    System.out.println("Test 4 Passes - Fetched live Value of active learners -> " +text5);
	    
	 
        JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(By.linkText(""));
        js.executeScript("arguments[0].scrollIntoView();", Element);  // yaha tak wala scroll karta hai
        driver.get("https://apply.workable.com/unacademy/");
        Thread.sleep(2500);
	    driver.findElement(By.xpath("//*[@id='app']/div/div/main/div[2]/ul/li[1]/div")).click();
        Thread.sleep(1000);
	    driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/apply/");
	    
        Thread.sleep(1600);

	    
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
	   /* WebElement ele = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/main/form/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); */
        
	    
	  /*  Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA"); drop down wala */
		
	   
        Thread.sleep(5000);
        driver.get("https://unacademy.com/about");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement Element1 = driver.findElement(By.linkText(""));
        js1.executeScript("arguments[0].scrollIntoView();", Element1); 
        
       /* WebElement ele = driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[3]/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele); 
        Thread.sleep(2500); */
      

	   // driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/");
	   //driver.get("https://apply.workable.com/unacademy/j/2CD4FCB2CB/apply/");
	   // driver.findElement(By.xpath("//div[@id='careers-jobs-list-styles__link--3qpm9']//a[@href='/unacademy/j/2CD4FCB2CB/']")).click();
	   //  driver.findElement(By.xpath("//div[@id='app']//a[@class='careers-jobs-list-styles__link--3qpm9']")).click();

        
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div/div[1]/div[1]/a/img")).click();


      
	   // driver.quit();

	    }
	}
