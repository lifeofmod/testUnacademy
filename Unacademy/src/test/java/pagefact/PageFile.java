package pagefact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFile {
	public WebDriver driver;

//I Understand that I should have reduced the xpaths manually sir, but trust me, I have been trying very hard & could'nt.

//I Will try again once all Frameworks are understood & implemented !
	
//I took care of nomenclature !
	
	@CacheLookup
	
	@FindBy(xpath = "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div/div[2]/div[1]/div/span[1]") WebElement ValueOne;
	@FindBy(xpath = "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div/div[2]/div[2]/div/span[1]") WebElement ValueTwo;
	@FindBy(xpath = "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div/div[2]/div[3]/div/span[1]") WebElement ValueThree;
	@FindBy(xpath = "//*[@id=\\\"__next\\\"]/div[1]/div[1]/div/div[2]/div[4]/div/span[1]") WebElement ValueFour;
	@FindBy(xpath = "//*[@id='__next']/div[1]/div[3]/div/button") WebElement OpenPos;
	@FindBy(xpath = "//*[@id=\\'app\\']/div/div/main/div[2]/ul/li[1]/div/a") WebElement ButtonAfterThat;
	@FindBy(xpath = "") WebElement Apply;
	@FindBy(id = "firstname") WebElement Firstn;
	@FindBy(id = "lastname") WebElement Lastn;
	@FindBy(id = "email") WebElement Email;
	@FindBy(xpath = "//*[@id='app']/div/div/div/main/form/section[1]/div[2]/div[4]/label/div/div/div/div/input") WebElement Phone;
	@FindBy(id = "CA_5516") WebElement City;
	@FindBy(xpath = "//*[@id='app']/div/div/div/main/form/section[2]/div[2]/div[1]/div/div/label/div") WebElement DropDown;
	@FindBy(xpath = "//*[@id='input_CA_5511_dialog']/div/div/ul/li[2]") WebElement DropDownOption;
	@FindBy(xpath = "//*[@id=\\'app\\']/div/div/div/main/form/section[2]/div[2]/div[2]/label/div/div/input") WebElement RelExp;
	@FindBy(xpath = "//span[@role='button']") WebElement UploadFile;
	@FindBy(xpath = "//*[@id=\\'app\\']/div/div/div/main/form/section[3]/div[2]/div[1]/label/div/div/input") WebElement Exp;
	@FindBy(xpath = "//*[@id=\\'app\\']/div/div/div/main/form/section[3]/div[2]/div[2]/div/div") WebElement DropDownTwo;
	@FindBy(xpath = "//*[@id=\\'input_CA_5515_dialog\\']/div/div/ul/li[2]") WebElement DropDownOptionTwo;
	@FindBy(xpath = "//*[@id='app']/div/div/div/main/form/button") WebElement Register;
	@FindBy(id = "") WebElement HoverOne;
	@FindBy(id = "") WebElement HoverTwo;
	@FindBy(id = "") WebElement HoverThree;
	@FindBy(id = "") WebElement Home;
	@FindBy(id = "") WebElement Facebook;
	@FindBy(id = "") WebElement YouTube;
	@FindBy(id = "") WebElement Twitter;


	
	public PageFile(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String firstText()
	{  //perform the actions using web elements
	       String textone = ValueOne.getText();
	       return textone;
	}
	public void secondText() {
	       ValueOne.getText();

	}
	public void thirdText() {
	       ValueOne.getText();

	}
	public void fourthText() {
	       ValueOne.getText();

	}
	public void openPosClick() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", OpenPos); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("");


	}
	public void buttonAfterThatClick() {
		ButtonAfterThat.click();

	}
	public void applyClick() {
		Apply.click();

	}
	public void firstEnter(String firstname) {
		
		Firstn.sendKeys(firstname);

	}
	public void lastEnter() {
		Lastn.sendKeys();

	}
	public void emailEnter() {
		Email.sendKeys();

	}
	public void phoneEnter() {
		Phone.sendKeys();

	}
	public void cityEnter() {
		City.sendKeys();

	}
	public void dropDownOpen() {
		DropDown.click();

	}
	public void dropDownSelect() {
		DropDownOption.click();

	}
	public void relaExpEnter() {
		RelExp.sendKeys();

	}
	public void uplaodFileFromBrowser() {
		UploadFile.click();

	}
	public void expEnter() {
		Exp.click();

	}
	public void dropDownTwoOpen() {
		DropDownTwo.click();

	}
	public void dropDownTwoSelect() {
		DropDownOptionTwo.click();

	}
	public void regButtonClick() {
		Register.click();

	}
	public void firstFounderText() {
		HoverOne.click();

	}
	public void secondFounderText() {
		HoverTwo.click();

	}
	public void thirdFounderText() {
		HoverThree.click();

	}
	public void homeButton() {
		Home.click();

	}
	public void fbButton() {
		Facebook.click();

	}
	public void ytButton() {
		YouTube.click();

	}
	public void tlButton() {
		Twitter.click();

	}
}
