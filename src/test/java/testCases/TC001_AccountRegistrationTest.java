package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.Accountregisterpage;
import pageObject.Homepage;

public class TC001_AccountRegistrationTest extends BaseClass
{
	public WebDriver driver;
	Homepage hpage;
	Accountregisterpage acountpage;


	
	@Test
	public void verify_account_registration() 
	{ 
		Homepage hp = new Homepage(driver);
		hp.clickregister();


		Accountregisterpage ac = new Accountregisterpage(driver);

		ac.setcountryname(randomestring());
		ac.setfirstname(randomestring().toUpperCase());
		ac.setlastname(randomestring().toLowerCase());
		ac.setEmail(randomestring()+"@gmail.com");
		ac.setcountryname(randomestring().toUpperCase());
		ac.setpassword(randomAlphanumeric());
		
//		ac.setcountryname("Sunil");
//		ac.setfirstname("Sunilshinde");
//		ac.setlastname("Shinde");
//		ac.setEmail("sunilshinde7665@gmail.com");
//		ac.setcountryname("india");
//		ac.setpassword("Sunil@123");
		
		ac.clickregisterbtn();

	}
	
	
}
