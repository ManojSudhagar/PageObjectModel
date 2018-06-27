package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreation
{
	WebDriver driver;
	public AccountCreation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static final By RADIO_TITLE = By.id("id_gender");
	public static final By TEXT_FIRSTNAME = By.id("customer_firstname");
	public static final By TEXT_LASTNAME = By.id("customer_lastname");
	public static final By TEXT_EMAIL = By.id("email");
	
	public void createAccount()
	{
		
	}


	

}
