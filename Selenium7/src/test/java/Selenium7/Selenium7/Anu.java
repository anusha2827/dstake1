package Selenium7.Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day7.ChromeDriver;
import junit.framework.Assert;

public class Anu 
{
	public static void main(String[]args) throws InterruptedException {
		testEmail_With_Characterspswd();
	}
	static void testEmail_With_Characterspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = (WebDriver) new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("ffguguyggyiuguiuui");
			Thread.sleep(100);
			String actual_error=driver.findElement(By.xpath("//h6[contains(text(),'Password must be at least 8 characters long and contain at least one number, one lowercase letter, one uppercase letter, and one special character.')]")).getText();
			Thread.sleep(1000);
			String expected_error="Password must be at least 8 characters long and contain at least one number, one lowercase letter, one uppercase letter, and one special character.";
			Thread.sleep(1000);
			Assert.assertEquals(actual_error,expected_error);
	}

}



		