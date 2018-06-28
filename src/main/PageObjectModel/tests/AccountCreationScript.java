package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountCreation;
import pages.HomePage;
import pages.MyAccount;


public class AccountCreationScript
{

	public static void main(String args[])
	{
		//instantiate browser
		//instantiate the drivere
		//call the method.
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	HomePage home = new HomePage(driver);
	home.clickSignIn();
	MyAccount account = new MyAccount(driver);
	account.newAccountCreation();
	AccountCreation ac = new AccountCreation(driver);
	ac.createAccount();
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
