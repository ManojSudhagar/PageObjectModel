package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;


public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public static final By LINK_SIGNIN = By.xpath("//a[@title='Log in to your customer account']");
	
	
	public void clickSignIn()
	{
		try
		{
			Utility util = new Utility(driver);
			util.findElement(LINK_SIGNIN).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
