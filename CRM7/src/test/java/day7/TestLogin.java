package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestLogin {

	/*@Test
	public void test_Account_Button() throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://backoffice.chaincrm.io/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
		WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])"));
		if(button.isEnabled())
		{
			System.out.println("Account button is enabled");
		}
		else 
		{
			System.out.println("Account button is disabled");                          
		}	
	}
	@Test
	public void test_Account_Create_SaveandNew() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Account')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("nsabfjlsdgjfkjhbjdfkldsuiytr#$%^&*65");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			Thread.sleep(3000);
			System.out.println("It will save the data and navigate to new page.");
	}
	
	@Test
	public void test_invalid_Account_Create_SaveandNew() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Account')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			Thread.sleep(3000);
	}
	@Test
	public void test_Account_Create_Save() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Account')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("nsabfjlsdgjfkjdsfhjksafd23456iuytr76");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(3000);
			System.out.println("Account info created Successfully");
	}
	@Test
	public void test_Account_Overview() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Sitesh')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(3000);
	}
	@Test
	public void test_Account_Edit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'nsabfjlsdgjfkjdsfhjksafd23456')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'backend te')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'DONE')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'UPDATE')])")).click();
			Thread.sleep(3000);	
			System.out.println("Account info updated successfully");
	}	
	@Test
	public void test_Account_Clone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Sitesh')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(3000);
			System.out.println("Account info created successfully");
	
	}
	@Test
	public void test_Account_Share() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'nsabfjlsdgjfkjdsfhjksafd23456iuytr76')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='public'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Read Write')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();
			Thread.sleep(3000);	
	}
	@Test
	public void test_Account_Delete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Sitesh')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Account deleted successfully");	
	}
	@Test
	public void test_Account_List() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'All Accounts')])[2]")).click();
			Thread.sleep(3000);
			/*driver.findElement(By.xpath("(//div[contains(text(),'My Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'New Last Week')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'New This Week')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Recently Created Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Recently Modified Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Accounts Shared by Me')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Accounts Shared to Me')])")).click();
			Thread.sleep(3000);
	}
	@Test
	public void test_Account_MassTransfer() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Excutive_1')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[1]")).click();
			Thread.sleep(3000);
			System.out.println("Updated Successfully");
	}
	@Test
	public void  test_Account_MassUpdate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='ps-2'])[15]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("345643245322345");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);	
			System.out.println("Successfully updated");
	}	
	@Test
	public void test_Account_MassDelete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Account Deleted Successfully");
			
	}
	@Test
	public void test_Account_RecordsPerPage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();
			Thread.sleep(3000);
			/*driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();
			Thread.sleep(3000);
			
	}
	@Test
	public void test_Account_Filter() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/filterMenu.8fdd0cb626dcc038bffc1f1f115e7ecb.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='Description'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);	
			System.out.println("Description column displayed in Account page");
	}
	@Test
	public void test_Account_Pagearrow() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Accounts')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='paginationArrow']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[1]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//span[@class='paginationArrow'])[2]")).click();
			//Thread.sleep(3000);
			 System.out.println("Pagination arrow successfull");
			 
	}
	@Test
	public void  test_Deals_createDeal_Save() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("5432");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'nsabfjlsdgjfkjdsfhjksafd23456iuytr76')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'jagadish002@mailinator.com')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='closingDate'])")).sendKeys("04-21-2000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class= ' css-1xc3v61-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Value Proposition')])")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[3]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//td[contains(text(),'charanraj Test two')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.className("mandatoryField"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Error Message for missing name field is incorrect");
			/*driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys(" ");
			Thread.sleep(3000);
			System.out.println("Deals created Successfully");
			
	}
	@Test
	public void test_Deals_Overview() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'dsv')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Needs Analysis')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer'])[2]")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'Qualification')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Need Analysis is displayed");
				
	}
	@Test
	public void test_Deals_MassUpdate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Annual Revenue')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"update Successfully");
	}
	@Test
	public void test_Deals_Edit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'dsv')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);	
	}
	@Test
	public void test_Deals_MassUpdate2() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Account Name')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("qlkjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"update Successfully");
	}
	@Test
	public void test_Deals_MassUpdate3() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Contact Name')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("qlkjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"update Successfully");
	}
	@Test
	public void test_Deals_MassUpdate4() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Stage')])[2]")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"To Select options in stage");
	}
	@Test
	public void test_Deals_Overview2() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'api')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='me-2 cursorPointer'])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//span[@class='me-2 cursorPointer'])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"To Navigate to  previous user details");
	}
	@Test
	public void test_Deals_MassUpdate5() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//span[contains(text(),'Closing Date')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("05/456/0987609");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Invalid value");
	}
	@Test
	public void test_Deals_MassUpdate6() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//span[contains(text(),'Amount')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("dfghj");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Invalid value");
	}
	@Test
	public void test_Deals_MassUpdate7() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Stage')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Proposal/Price Quote')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'manam')])[1]")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'Proposal/Price Quote')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"It displays proposal/price Quote everywhere in that particular user");
	}
	@Test
	public void test_Deals_MassUpdate8() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'manam')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/likeDropdownNew.9ea19a1544c32d6b8fa7de4148a46be3.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//li[contains(text(),'Closed Won')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='amount'])[2]")).sendKeys("skjdhfjs234");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"It displays invalid amount");
	
	}
	@Test
	public void test_Deals_MassUpdate9() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'manam')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/dislikeDropdown.8135244b9722604c996b31d32389ec89.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//li[contains(text(),'Closed Lost')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='amount'])[2]")).sendKeys("asdfg2345");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Unqualified Customer')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//div[contains(text(),'One of the required field is empty or contains invalid data, please check your input(s).')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"It displays invalid amount");
	}
	@Test
	public void test_Product_button() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
	}
	@Test
	public void test_Product_Create_Saveandnew() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
			Thread.sleep(3000);         //Product details added successfully
			driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("abc");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("abc");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();     //Something went wrong. Please try after sometime  
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details added successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"added successfully");
	}
	@Test
	public void test_Product_Create_Save() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
			Thread.sleep(3000);         //Product details added successfully
			driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("abc");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("abc");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();     //Something went wrong. Please try after sometime  
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details added successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"added successfully");
	}
	
	@Test
	public void test_Product_Create_Save2() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
			Thread.sleep(3000);         //Product details added successfully
			driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("abcdf");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("abc@#$%%$#@!#");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();     //Something went wrong. Please try after sometime  
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Something went wrong. Please try after sometime')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"invalid product code");
	}
	@Test
	public void test_Product_Create_Save3() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
			Thread.sleep(3000);         //Product details added successfully
			driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("abcdfqwerfg");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("@#$%%$#@!#asdfg");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='saleEndDate']")).sendKeys("03/14/546754");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='supportEndDate']")).sendKeys("5/16/123456");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();     //Something went wrong. Please try after sometime  
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Something went wrong. Please try after sometime')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"invalid product code");
	}
	@Test
	public void test_Product_Create_Save3() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Create Product')])")).click();
			Thread.sleep(3000);         //Product details added successfully
			driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("abcdfqwerfg");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("@#$%%$#@!#asdfg");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='saleEndDate']")).sendKeys("03/14/546754");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@name='supportEndDate']")).sendKeys("5/16/123456");
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();     //Something went wrong. Please try after sometime  
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Something went wrong. Please try after sometime')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"invalid product code");
	}
	@Test
	public void test_Product_Edit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//td[contains(text(),'iuyg')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
	}
	@Test
	public void test_Product_Clone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//td[contains(text(),'iuyg')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"same copy of that user display in the product page");
			
	}	
	@Test
	public void test_Product_Share() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//td[contains(text(),'iuyg')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='public'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();   //Share Products Access added Successfully
			Thread.sleep(3000);	
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Share Products Access added Successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"shared successfully");
	}
	@Test
	public void test_Product_Delete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//td[contains(text(),'iuyg')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();   //Product details deleted successfully.
			Thread.sleep(3000);	
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details deleted successfully.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Deleted successfully");	
	}
	@Test
	public void test_Product_MassTransfer() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='ms-2'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[1]")).click();   //Updated Successfully !
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Updated Successfully !')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Transfered successfully");
	}
	@Test
	public void test_Product_MassDelete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div])[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')")).click();   //Product details deleted successfully.
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details deleted successfully.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Deleted successfully");
			
	}
	@Test
	public void test_Product_Massupdate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");		
	}
	@Test
	public void test_Product_Massupdate_commissionRate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Commission Rate')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");
			
	}
	@Test
	public void test_Product_Massupdate_Description() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Description')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Handler() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Handler')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Manufacture() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Manufacture')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_ProductActive() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Product Active')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_ProductCode() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Product Code')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_productName() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Product Name')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_ProductOwner() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Product Owner')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_QtyOrdered() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Qty Ordered')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Quantityinstock() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Quantity in Stock')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_ReorderLevel() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Reorder Level')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_SaleEnddate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sale End Date')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1/01/2024");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_SaleStartdate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sale Start Date')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1/4/2989");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_supportStartdate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Support End Date')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1/24/4356");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Tax() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Tax')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Taxable() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Taxable')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_unitprice() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Unit Price')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_UsageUnit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Usage Unit')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("1dfghjh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();   //Internal DB Error!
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Product details updated successfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"updated successfully");	
	}
	@Test
	public void test_Product_Massupdate_Pagination() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'sewrtyrew')])")).click();    
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='me-2 opacity-50']")).click();
			Thread.sleep(6000);	
	}
	@Test
	public void test_Product_Massupdate_RecordsPerpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Products')])")).click();     //Product details updated successfully
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(6000);	
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();     //Product details updated successfully
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_button() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Navigate to Vendors page");
	}
	@Test
	public void test_Vendors_Create_saveandnew() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("adjasd");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjasd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2134565431");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Create vendor successfully");
	}	
	@Test
	public void test_Vendors_Create_save() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("adjasdsdf");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjaSasd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2134565431");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='save-button'])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//button[@class='save-button'])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Create vendor successfully");
	}
	@Test
	public void test_Vendors_Create_invalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("2342342");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjaSaasdsd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2134565497");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='save-button'])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Vendor Name cannot be empty.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor name");	
	}
	@Test
	public void test_Vendors_Create_invalidemail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("saghdj");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjaSaasdsdcom");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2134565497");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='save-button'])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid email address.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor mail");
	}
	@Test
	public void test_Vendors_Create_invalidphonenumber() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("saghdj");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjaSaasdsd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("edsfgaS");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='save-button'])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Phone Number cannot be empty.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor number");
	}
	@Test
	public void test_Vendors_Create_invalid_loading() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Vendor')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys("hajDJ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("adjaSaasdsd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6547788999");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//button[@class='save-button'])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"save button is loading..");
	}
	@Test
	public void test_VendorsOverviewpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'swsdef')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//span[contains(text(),'Overview')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"Navigate to overview page");
	}	
	@Test
	public void test_VendorsOverview1() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'werrer')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='country'])[1]")).click();      //Updated Successfully ! h4
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='country'])[1]")).sendKeys("ndkaskjdas");      //Updated Successfully ! h4
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg'])")).click();     
			Thread.sleep(6000);	
	}
	@Test
	public void test_VendorsEdit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'kljhg')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='save-button'])")).click();     //Vendor Updated Succesfully
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//h4[contains(text(),'Vendor Updated Succesfully')])")).click();     
			//Thread.sleep(3000);
			
	}
	@Test
	public void test_VendorsShare() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'kljhg')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='public']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();  //Share Vendors Access added Successfully   
			Thread.sleep(6000);	
	}
	@Test
	public void test_VendorsDelete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'kljhg')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_VendorsMyvendors() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'My Vendors')])")).click();     
			Thread.sleep(3000);	
	}	
	
	@Test
	public void test_VendorsVendors_shared_byme() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Vendors Shared by Me')])")).click();     
			Thread.sleep(3000);	
	}	
	@Test
	public void test_Vendorsvendors_shared_tome() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Vendors Shared to Me')])")).click();     
			Thread.sleep(3000);	
	}	
	@Test
	public void test_Vendors_Allvendors() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'All Vendors')])[2]")).click();     
			Thread.sleep(3000);	
	}
	
	@Test
	public void test_Vendors_10Records() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();     
			Thread.sleep(3000);	
	}
	@Test
	public void test_Vendors_20Records() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();     
			Thread.sleep(3000);	
	}
	@Test
	public void test_Vendors_30Records() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();     
			Thread.sleep(3000);	
	}
	@Test
	public void test_Vendors_40Records() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();     
			Thread.sleep(3000);	
	}
	@Test
	public void test_Vendors_50Records() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();     
			Thread.sleep(3000);	
	}	
	@Test
	public void test_Vendors_Masstransfer() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'admin')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
			
	}	
	@Test
	public void test_Vendors_MassDelete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_VendorName() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfsd");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_VendorNameinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("213456432");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor name.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor name");	
	}
	@Test
	public void test_Vendors_MassUpdate_VendorEmail() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Email')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfsd@mail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_VendorNameinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Email')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfsdcom");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor email.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor email");	
	}
	@Test
	public void test_Vendors_MassUpdate_VendorPhone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Phone')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("234535334234");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_Vendorphoneinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Phone')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfsdcom");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor email.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor email");	
	}
	@Test
	public void test_Vendors_MassUpdate_VendorWebsite() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Website')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("234535334234fdsjkfkwa");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_Vendorwebsiteinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Website')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("``````");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor email.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor email");	
	}
	@Test
	public void test_Vendors_MassUpdate_VendorGLAccount() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'GL Account')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Rental Income')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Vendors_MassUpdate_Vendor_Category() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Category')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("``````");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor email.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor email");	
	}
	
	@Test
	public void test_Vendors_MassUpdate_VendorCategoryinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Category')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdjbsj");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
				
	}
	@Test
	public void test_Vendors_MassUpdate_Vendor_Country() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("``````");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Please enter a valid Vendor email.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"enter valid vendor email");	
	}
	
	@Test
	public void test_Vendors_MassUpdate_VendorCountryinvalid() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Vendors')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@id='mass-dropdown'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdjbsj");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			
	}
	@Test
	public void test_Invoicebutton() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);	
	}
	@Test
	public void test_Invoice_create_saveandnew() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Invoice')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("xkjhzKJ     Xsakjndk");
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])[3]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'7895434567')])[1]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Invoice information details added Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully created");	  //Invoice information details added Succesfully
			
	}
	@Test
	public void test_Invoice_create_save() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Invoice')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='subject'])")).sendKeys("xkjhzKJ    kjndk");
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])[3]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'7895434567')])[1]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//p[contains(text(),'Invoice information details added Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully created");	  //Invoice information details added Succesfully	
	}
	@Test
	public void test_Invoice_create_edit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Hello')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details Updated Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");
	}
	@Test
	public void test_Invoice_create_clone() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Hello')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details added Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully clone");
	}
	@Test
	public void test_Invoice_create_Share() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Hello')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='public'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Invoice_create_Delete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Hello')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice details deleted successfully.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully deleted");
	}
	@Test
	public void test_Invoice_create_invalidedit() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Testing purpose')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[1]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingStreet'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCity'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingState'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCode'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCountry'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Copy Address')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Billing to Shipping')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details Updated Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");
	}
	@Test
	public void test_Invoice_create_Termsandconditions() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Subject one')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[1]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingStreet'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCity'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingState'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCode'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='billingCountry'])")).sendKeys("dgjdsfjg@#$%^&*^%$#4567865      @#$%^$45634%^&%$#%^&`````````````````");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Copy Address')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[contains(text(),'Billing to Shipping')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//textarea[@class='ps-2 pt-2 pb-4'])[1]")).sendKeys("lxzdghczchsbjhcusdj#$%^$#@$5654356754         '''''```````````````;xlkbjvclx;ckvjfbvfld;sfkjhngklfd;kghnmkgfl;dkghmn");     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice information details Updated Succesfully')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_create_MassTransfer() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'Associate Enginner UI/UX')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[1]")).click();   //Updated Successfully !    
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Updated Successfully !')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");	
	}
	@Test
	public void test_Invoice_create_MassDelete() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();   //Updated Successfully !    
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Invoice details deleted successfully.')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully deleted");
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Billingcity() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing City')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");
			
	}
	@Test
	public void test_Invoice_MassUpdate_Billingcity() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing City')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("uhswehdfjs");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Billingcode() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Code')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("uhswehdfjs");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Billingcode() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Code')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("2345675");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_BillingCountry() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Billingcountry() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfgdsdfghf");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}*
	@Test
	public void test_Invoice_MassUpdate_Invalid_BillingState() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing State')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Billingstate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing State')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfgdsdfghf");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_BillingStreet() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Street')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Billingstreet() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Billing Street')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sdfgdsdfghf");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Duedate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Due Date')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765jxhhcnasm");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Duedate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Due Date')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("01/05/1999");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Exciseduty() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Excise Duty')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("jxhhcnasm");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_ExciseDuty() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Excise Duty')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("01/05/1999");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Invoicedate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Invoice Date')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("jxhhcnasm");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invoicedate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Invoice Date')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("01/05/1999");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Purchaseorder() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Purchase Order')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Purchaseorder() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Purchase Order')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("jhsdfhsdj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_SalesCommision() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sales Commision')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("jxhhcnasm");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_SalesCommision() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Sales Commision')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("2345643");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Shippingcity() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping City')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Shippingcity() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping City')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("sahbjsabfjsd");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Shippingcode() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping City')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("shadhjfjsdjkjj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Shippingcode() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping Code')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("823687248");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Shippingcountry() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Shippingcountry() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping Country')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("ehjqwhj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Shippingstate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping State')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Shippingstate() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping State')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("ehjqwhj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Shippingstreet() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping Street')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Shippingstreet() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Shipping Street')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("ehjqwhj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Status() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Status')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("4567898765");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_status() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Status')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delivered')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_Invalid_Subject() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Subject')])[3]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_MassUpdate_subject() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Subject')])[3]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("ehjqwhj");     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//h4[contains(text(),'Successful')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"successfully updated");		
	}
	@Test
	public void test_Invoice_filtericon() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/filterMenu.8fdd0cb626dcc038bffc1f1f115e7ecb.svg'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='Shipping City'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();     
			Thread.sleep(3000);
			WebElement errorMessage  = driver.findElement(By.xpath("(//span[contains(text(),'Shipping City')])"));
			Assert.assertTrue(errorMessage.isDisplayed(),"display shipping city column");
	}
	@Test
	public void test_Invoice_10recordsperpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])[2]")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Invoice_20recordsperpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Invoice_30recordsperpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Invoice_40recordsperpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();     
			Thread.sleep(3000);
	}
	@Test
	public void test_Invoice_50recordsperpage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();     
			Thread.sleep(3000);
	}*/
	@Test
	public void test_Invoice_arrows() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("rabi01@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'More')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[contains(text(),'Invoices')])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])")).click();     
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[1]")).click();     
			Thread.sleep(3000);
	}
}
	
