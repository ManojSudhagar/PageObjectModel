package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

public class AccountCreation
{
	WebDriver driver;
	public AccountCreation(WebDriver driver)
	{
		this.driver=driver;
		Utility util = new Utility(driver);
	}
	
	public static final By RADIO_TITLE_MR = By.id("id_gender1");
	public static final By RADIO_TITLE_MRS = By.id("id_gender2");
	public static final By TEXT_CUSTOMERFIRSTNAME = By.id("customer_firstname");
	public static final By TEXT_CUSTOMERLASTNAME = By.id("customer_lastname");
	public static final By TEXT_EMAIL = By.id("email");
	public static final By PWD_PASSWORD= By.id("passwd");
	public static final By DRP_DATE= By.id("days");
	public static final By DRP_MONTH= By.id("months");
	public static final By DRP_YEAR= By.id("years");
	public static final By TEXT_FIRSTNAME = By.id("firstname");
	public static final By TEXT_LASTNAME = By.id("lastname");
	public static final By TEXT_ADDRESS = By.id("address1");
	public static final By TEXT_CITY = By.id("city");
	public static final By DRP_STATE= By.id("id_state");
	public static final By TEXT_ZIPCODE = By.id("postcode");
	public static final By DRP_COUNTRY= By.id("id_country");
	public static final By TEXT_HOMEPHONE = By.id("phone");
	public static final By TEXT_MOBILEPHONE = By.id("phone_mobile");
	public static final By TEXT_ALIASADDRESS = By.id("alias");
	public static final By BTN_REGISTER = By.id("submitAccount");



			


	public void createAccount()
	{
		Utility util = new Utility(driver);
		util.selectRadioButton(RADIO_TITLE_MR,null,"BY");
		util.inputText(TEXT_CUSTOMERFIRSTNAME,"MANOJ");
		util.inputText(TEXT_CUSTOMERLASTNAME,"SUDHAGAR");
		//util.inputText(TEXT_EMAIL,"");
		util.inputText(PWD_PASSWORD,"ecommerce");
		//util.selectDropDown(DRP_DATE, "1",0, "", "Value");
		//util.selectDropDown(DRP_MONTH, "1",0, "", "Value");
		//util.selectDropDown(DRP_YEAR, "2000",0, "", "Value");
		//util.inputText(TEXT_FIRSTNAME,"MANOJ");
		//util.inputText(TEXT_LASTNAME,"SUDHAGAR");
		util.inputText(TEXT_ADDRESS,"653 N. Devonshire Drive");//754-3010//(541) 754-3010
		util.inputText(TEXT_CITY,"STATEN ISLAND");
		util.selectDropDown(DRP_STATE, "",0, "New York", "VisibleText");
		util.inputText(TEXT_ZIPCODE,"10301");
		util.selectDropDown(DRP_COUNTRY, "21",0, "", "Value");
		util.inputText(TEXT_MOBILEPHONE,"754-3010");
		util.inputText(TEXT_ALIASADDRESS,"SAME AS ABOVE");
		util.findElement(BTN_REGISTER).click();






	}


	

}
