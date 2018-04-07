package testScript;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.screenshots;


public class Rediff_login_01 
{
	public static WebDriver driver;
	Properties prop=new Properties();
	@Test
	public void login() throws Exception
	{
		
		FileInputStream fis1= new FileInputStream("C:\\Users\\Ankita\\Documents\\JAVA classes\\Maven_testNG\\src\\main\\resources\\ObjectReposatory\\UI.property");
		FileInputStream  fis2= new  FileInputStream("C:\\Users\\Ankita\\Documents\\JAVA classes\\Maven_testNG\\src\\main\\resources\\dataMap\\data.property");
		
		prop.load(fis1);
		prop.load(fis2);
		System.setProperty("webdriver.chrome.driver", "C:\\Java_start\\chromedriver.exe");
      driver= new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	screenshots.screenshot();
	//utility.screenshots();
	
	
	Thread.sleep(3000);
	
	System.out.println();
	// Customised Xpath.

		
	driver.findElement(By.xpath(prop.getProperty("userid_xpath"))).sendKeys(prop.getProperty("email_id"));
	screenshots.screenshot();
	driver.findElement(By.xpath(prop.getProperty("pass_xpath"))).sendKeys(prop.getProperty("password"));
	screenshots.screenshot();

	
	//customised css2:
	//driver.findElement(By.cssSelector(prop.getProperty("login_cssSelector"))).sendKeys(prop.getProperty("enter"));
	
	driver.findElement(By.name(prop.getProperty("procedd_name"))).click();
	screenshots.screenshot();
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	//driver.findElement(By.linkText("Home")).click();
	
	//driver.findElement(By.partialLinkText("Forgot")).click();
	System.out.println("passed");
	
	}
	
}
