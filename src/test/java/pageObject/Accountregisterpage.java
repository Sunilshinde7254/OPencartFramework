package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregisterpage extends Basepage
{

	public Accountregisterpage(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='input-username']") WebElement txtusername;
	
	@FindBy(xpath = " //input[@id='input-firstname']")WebElement txtfirstname;
	
	@FindBy(xpath = " //input[@id='input-lastname']")WebElement txtlastname;
	
	@FindBy(xpath = "//input[@id='input-email']")WebElement txtmailid;
	
	//@FindBy(xpath = " //select[@id='input-country']")WebElement txtcountryname;
	@FindBy(xpath = "//div[@id='account-register']//div[4]")WebElement txtcountryname;
	
	@FindBy(xpath = "//input[@id='input-password']")WebElement txtpassword;
 
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg hidden-xs']")WebElement btncliklregister;
	@FindBy(xpath = "//h3[normalize-space()='Welcome to OpenCart, your account has been created']") WebElement verytext;
	
	public void setusername(String username) 
	{
		txtusername.sendKeys(username);
	}
	public void setfirstname(String firtsname)
	{
		txtfirstname.sendKeys(firtsname);
	}
	public void setlastname(String lastname)
	{
		txtlastname.sendKeys(lastname);
	}
	public void setEmail(String mailid)
	{
		txtmailid.sendKeys(mailid);
	}
	public void setcountryname(String country) 
	{
		txtcountryname.sendKeys(country);
	}
	public void setpassword(String password) 
	{
		txtpassword.sendKeys(password);
	}
	public void clickregisterbtn()
	{
		btncliklregister.click();
	}
	public void veryfytext(String verytext) 
	{
		
	}
	
}
