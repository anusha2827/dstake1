package CRMWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMWeb1 {

	public static void main(String[] args) throws InterruptedException {
		testvalid_user_signup();
	}
	static void testvalid_user_signup() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sign Up')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='First Name'])")).sendKeys("Anushaaa");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Last Name'])")).sendKeys("jagadeesh");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Email'])")).sendKeys("anuj1@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("Anusha@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'])")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@placeholder='Company Name'])")).sendKeys("ABC private ltd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Mobile'])")).sendKeys("1234567890");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-gz24nq-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Karnataka')])")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])")).click();
			//Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])"));
			if(button.isEnabled())
			{
				System.out.println("User Details added successfully");
			}
			else 
			{
				System.out.println("user details is not added successfully");                          
			}	
	}
}
