package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utility;

public class MyAccount {

	WebDriver driver;
	public MyAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	public static final By TEXT_NEWEMAILCREATION = By.id("email_create");
	public static final By BTN_ACCOUNT_CREATION = By.id("SubmitCreate");
	public static final By TEXT_EMAIL = By.id("email");
	public static final By TEXT_PASSWORD = By.id("passwd");
	public static final By BTN_SIGNIN = By.id("SubmitLogin");

	
	public void newAccountCreation()
	{
		try
		{
			Utility util = new Utility(driver);
			String email = util.randomStringCreation();
			System.out.println("The random string " +email);
			util.inputText(TEXT_NEWEMAILCREATION,email+"@gmail.com"+"");
			util.findElement(BTN_ACCOUNT_CREATION).click();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
