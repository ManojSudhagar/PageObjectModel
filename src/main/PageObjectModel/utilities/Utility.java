package utilities;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

 WebDriver driver;
 
 public Utility(WebDriver driver) 
 {
  this.driver = driver;
 }
 
 public WebDriver browserInstantiation(String browser)
 {
	 WebDriver driver= null;
	 browser=browser.toUpperCase();
	 int value =(browser == "INTERNETEXPLORER")?1:(browser == "MOZILLAFIREFOX")?2:3;
	 
	 try
	 {
		 switch(value) {
		 
		 case 1:
			 driver = new InternetExplorerDriver();
			 break;
			 
		 case 2 :
			 driver = new FirefoxDriver();
			 break;
			 
		 case 3 :
			 driver = new ChromeDriver();			 
			 break;
		 
		 default :			 
			 System.out.println("Not a proper browser value provided");
		 }
	 }
	 catch(Exception e){
		 System.out.println(e.getMessage());
	 }
	return driver;
	 
 }

 public void inputText(By by, String Text) 
 { 
	 WebElement Element = null;
	 try 
	 {
	   Element = findElement(by);
	   Element.sendKeys(Text);
	 } 
	 catch (Exception e) {
	   System.out.println(e.getMessage());
	 }
}

 public WebElement findElement(By by) 
 {
	 WebElement element = null;
	 try 
	 {
	   element = driver.findElement(by);
	 } 
	 catch (Exception e) {
	  System.out.println(e.getMessage());
	 }
	 return element;
 }

 public WebElement findElement(By by, WebElement element) 
 {
	 WebElement webelement = null;
	 try 
	 {
		 webelement = element.findElement(by);
	 } 
	 catch (Exception e) {
		System.out.println(e.getMessage());
	 }
   return webelement;
 }

 public List findElements(By by, WebElement element) 
 {
  List < WebElement > Elements = null;
  try 
  {
   Elements = element.findElements(by);
  } 
  catch (Exception e) {
	 System.out.println(e.getMessage());
  }
  return Elements;
 }

 public List findElements(By by) 
 {
  List <WebElement> Elements = null;
  try 
  {
   Elements = driver.findElements(by);
  } 
  catch (Exception e) {
    System.out.println(e.getMessage());
  }
  return Elements;
 }

 public void selectRadioButton(By by, String Value, String method) 
 {
  
  WebElement element;
  String radiotext;
  List < WebElement > elements;
  method=method.toUpperCase();
  int flag = (method == "BY") ? 1 : 2;
  
  try
  {
	switch (flag) 
	{
   		case 1:
   		  element = driver.findElement(by);
   		  element.click();
   		break;
    
   		case 2:
   			elements = driver.findElements(by);
	   		for (int i = 0; i < elements.size(); i++) 
	   		{  
	   			radiotext = elements.get(i).getText();
	   			if (radiotext.equalsIgnoreCase(Value)) 
	   			{
	   				elements.get(i).click();
	   			}
	   		}
	   		break;

   		default:
    	System.out.println("Not a proper value");   
    }
  }
  catch(Exception e){
		System.out.println(e.getMessage());
  }
 }
 
 public void selectDropDown(By by, String Value,int index,String VisibleText,String method)
 {
	  WebElement element;
	  method=method.toUpperCase();
	  int flag = (method == "INDEX") ? 1 : (method == "VALUE") ? 2 : 3;
	  
	 try
	 {
		 element = findElement(by);
		 Select se = new Select(element);
		 
		 switch(flag) {
		 case 1:
			 se.selectByIndex(index);
			 break;
			 
		 case 2:
			 se.selectByValue(Value);
			 break;
			 
		 case 3:
			 se.selectByVisibleText(VisibleText);
			 break;
		
		 default:
			 System.out.println("Inapproapriate value");
			 break;
		
	 }
	 }
	 catch(Exception e){
		 System.out.println(e.getMessage());
	 }
 }
 public  String randomStringCreation()
 {
	 StringBuffer randStr = new StringBuffer();
	 String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	 int RANDOM_STRING_LENGTH = 5;
	 
	 try
	 {
	        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
	       	 int num = 1 + (int)(Math.random() * ((36 - 1) + 1));
	            char ch = CHAR_LIST.charAt(num);
	            randStr.append(ch);
	        }
	 }
	 catch(Exception e){
		 System.out.println(e.getMessage());
	 }
     return randStr.toString();
 }
 }
