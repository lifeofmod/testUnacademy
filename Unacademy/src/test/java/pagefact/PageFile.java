package pagefact;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFile {
	public WebDriver driver;
	String expectedTitle;


	
	@CacheLookup
	
	@FindBy(xpath = "//span[contains(text(),'50M')]") WebElement ValueOne;
	@FindBy(xpath = "//span[contains(text(),'1000')]") WebElement ValueTwo;
	@FindBy(xpath = "//span[contains(text(),'1B')]") WebElement ValueThree;
	@FindBy(xpath = "//span[contains(text(),'2000')]") WebElement ValueFour;
	@FindBy(xpath = "//button[contains(text(),'See open postions')]") WebElement OpenPos;
	@FindBy(xpath = "//a[@href='/unacademy/j/614A9AD6C8/']") WebElement ButtonAfterThat;
	@FindBy(xpath = "//a[@href='/unacademy/j/614A9AD6C8/apply/']") WebElement Apply;
	@FindBy(id = "firstname") WebElement Firstn;
	@FindBy(id = "lastname") WebElement Lastn;
	@FindBy(id = "email") WebElement Email;
	@FindBy(xpath = "//input[@name='phone']") WebElement phone;
	@FindBy(id = "CA_5516") WebElement City; ////input[@id='CA_5516']
	@FindBy(xpath = "//input[@role='combobox']") WebElement DropDown;
	@FindBy(xpath = "//span[text()='0-1']") WebElement DropDownOption;
	@FindBy(xpath = "//span[@role='button']") WebElement UploadFile;
	@FindBy(xpath = "//input[@name='CA_5513']") WebElement Sal;
	@FindBy(xpath = "//button[text() ='Submit application']") WebElement Register;
	@FindBy(xpath = "//div[contains(@class,'LeaderBlock__Face')]//child::div[1]") WebElement HoverOne;
	@FindBy(xpath = "//div[contains(@class,'LeaderBlock__Face')]//child::div[2]") WebElement HoverTwo;
	@FindBy(xpath = "//div[contains(@class,'LeaderBlock__Face')]//child::div[3]") WebElement HoverThree;
	@FindBy(xpath = "//a[@href='https://www.instagram.com/unacademy/']") WebElement Instagram;
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/unacademy']") WebElement LinkedIn;

	
	public PageFile(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String firstText()
	{  //perform the actions using web elements
	       String text1 = ValueOne.getText();
	       return text1;
		
	}
	public String secondText() 
	{
		   String text2 = ValueTwo.getText();
	       return text2;
	}
	public String thirdText() 
	{
	       String text3 = ValueThree.getText();
	       return text3;

	}
	public String fourthText() 
	{
	       String text4 = ValueFour.getText();
	       return text4;

	}
	public void openPosClick() 
	{
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", OpenPos); 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	}
	
	public void buttonAfterThatClick() 
	{
		ButtonAfterThat.click();
	}
	
	public void applyClick() 
	{
        Apply.click();
	}
	
	public void firstEnter(String firstname) {
		
		Firstn.sendKeys(firstname);

	}
	public void lastEnter(String lastname) {
		Lastn.sendKeys(lastname);

	}
	public void emailEnter(String mail) {
		Email.sendKeys(mail);

	}
	public void enterPhoneNo(String phnno) {
		phone.sendKeys(phnno);

	}
	public void cityEnter(String city) {
		City.sendKeys(city);

	}
	public void dropDownOpen() {
		DropDown.click();

	}
	public void dropDownSelect() {
		DropDownOption.click();

	}
	public void uploadFileBrowser() {
		UploadFile.click();
	}
	public void salaryEnter(String recentsalary) {
		Sal.sendKeys(recentsalary);

	}
	public void regButtonClick() {
		Register.click();

	}
	public void firstFounderText() {      
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element1 = HoverTwo;
	    js.executeScript("arguments[0].scrollIntoView();", Element1);
	    Actions act = new Actions(driver);
	    act.moveToElement(HoverOne).build().perform();

	}
	public void secondFounderText() {
	    Actions act = new Actions(driver);
	    act.moveToElement(HoverTwo).build().perform();
	}
	public void thirdFounderText() {
		Actions act = new Actions(driver);
	    act.moveToElement(HoverThree).build().perform();
	}
	public void instButton() {
		Instagram.click();

	}
	public void lnButton() {
		LinkedIn.click();

	}
	public void instVerif() {
		expectedTitle = "Unacademy (@unacademy) • Instagram photos and videos";
		Assert.assertEquals(driver.getTitle(),expectedTitle);
		System.out.println(driver.getTitle());
	}
	public void lnverify() {
		expectedTitle = "Unacademy | LinkedIn";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),expectedTitle);
	}
}
