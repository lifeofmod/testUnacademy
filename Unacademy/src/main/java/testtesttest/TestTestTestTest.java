package testtesttest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestTestTestTest {
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
	  moverOver(driver);
    }
}