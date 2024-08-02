package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{

	public Homepage(WebDriver driver) 
	{
		super(driver);
		
	}

@FindBy(xpath = "//a[@class='btn btn-black navbar-btn']") WebElement registerclick;

public void clickregister()
{
	registerclick.click();
}


}
