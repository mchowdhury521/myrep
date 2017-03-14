package tests;
//www.sejsoft.com/downloads/jars.rar
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void openConnection(){
		// db connection
		System.out.println("connected to database");
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("closing the database connection");
	}
	
	@BeforeMethod
	public void openBrowser(){
		// selenium
		System.out.println("Opening browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing browser");

	}
	
	@Test // annotation - represents test case
	public void testLogin(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		//driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		driver.close();
		// selenium code
		//System.out.println("Executing logintest");
	}
	
	

}
