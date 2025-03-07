package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class ChainCRM1
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*testvalid_mail_pswd();
		 testinvalid_mail_pswd();
		 testvalid_mail_invalid_pwsd();
		 test_lead_Button();
		 test_Createlead();                           //Lead
		 test_Createlead_invalid_Credentials();
		 test_Overview_Lead();
		 test_valid_Overview_Lead1();
		 test_invalid_Overview_Lead1();
		 test_Edit_Lead();
		 test_MassTransfer_Lead();
		 test_MassUpdate_Lead();
		 test_MassDelete_Lead();
		 test_RecordsPage_Lead();
		 test_Clone_Lead();
		 test_Share_Lead();
		 test__Arrows_Lead();                          
		 test_Contactbutton();                            //Contact 
		 test_Contact_Create_button();
		 test_Contact_CreatePage();
		 test_invalid_Contact_CreatePage();
		test_Contact_Edit_Page();
		 test_Contact_invalid_Edit_Page();
		test_Contact_Clone_Page();
		 test_Contact_managecolumns_Page();
		 test_Contact_Share_Page();
		 test_Contact_Delete_Page();
		 test_Contact_MassTransfer_Page();
		 test_Contact_MassUpdate_Page();
		 test_Contact_MassDelete_Page();
		 test_ContactPage_Arrows();
		 test_Account_Button();                  //Account
		test_Account_Create_SaveandNew();
		test_invalid_Account_Create_SaveandNew();
		test_Account_Create_Save();
		test_Account_Overview();
		test_Account_Edit();
		test_Account_Clone();
		test_Account_Share();
		test_Account_Delete();
		test_Account_MassTransfer();
		test_Account_MassUpdate();
		test_Account_MassDelete();
		test_Account_RecordsPerPage();
		test_Account_Filter();
		test_Account_Pagearrow();	
		test_Deals_button();               //Deals
		test_Deals_createDeal_Saveandnew();
		test_Deals_createDeal_Save();
		test_Deals_DealSharedbyme();
		test_Deals_Overview();
		test_Deals_createDeal_Save();
		test_Deals_OverviewStage();
		test_Deals_Edit();
		test_Deals_Clone();
		test_Deals_Share();
		test_Deals_Delete();
		test_Deals_MassTransfer();
		test_Deals_MassDelete();
		test_Deals_MassUpdate();
		test_Deals_recordsperpage();
		test_Deals_Arrows();*/
		
		 }
	/*static void testvalid_mail_pswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			System.out.println("Navigates to CRM Home page");
			
			/*WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled");
			}
			else 
			{
				System.out.println("Next button is disabled");
			}
	}
	static void testinvalid_mail_pswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha#@$@#mailinator.com");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			//Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			System.out.println("Navigates to CRM Home page");
			
			WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled but not clickable");
			}
			else 
			{
				System.out.println("Next button is enabled with clickable");
			}
	}
	static void testvalid_mail_invalid_pwsd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			System.out.println("Invalid Credentials..");
			
			/*WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled");
			}
			else 
			{
				System.out.println("Next button is disabled");
			}
	}
	
	
	static void test_lead_Button() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(6000);
			System.out.println("Lead Page Opened");
			
			WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled");
			}
			else 
			{
				System.out.println("Next button is disabled");
			}
	}
	static void test_Createlead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-sm py-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='leadInputField cursorPointer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@class='cursorPointer list-group-item'][2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='cursorPointer pt-2 ps-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'ronit@mailinator.com')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave modalButton']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("abc");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("MJ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("anusha1@mailinator.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
			Thread.sleep(3000);
			System.out.println("Leads Added Successfully");
			/*WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled");
			}
			else 
			{
				System.out.println("Next button is disabled");                          
			}
	}
	static void test_Createlead_invalid_Credentials() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-sm py-2']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='leadInputField cursorPointer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@class='cursorPointer list-group-item'][2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='cursorPointer pt-2 ps-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'ronit@mailinator.com')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave modalButton']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("@#$%^&%$#@#$%");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("#@$%^$#@$%^");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("anusha1@mailinator.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
			Thread.sleep(3000);
			System.out.println("Leads Added Successfully");
			WebElement button = driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']"));
			if(button.isEnabled())
			{
				System.out.println("Next button is enabled");
			}
			else 
			{
				System.out.println("Next button is disabled");                          
			}
}
	static void test_Overview_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(2000);
	}
	static void test_valid_Overview_Lead1() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Owner')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Owner')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='d-flex input-with-clear'])[2]")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Suraj Sharma']")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Change Owner')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Email Id')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Source')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='w-50 mt-1 ms-5 position-relative'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Seminar Partner')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 '])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Phone Number')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='d-flex editInput_container '])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123565");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Title')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Status')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='w-50 mt-1 ms-5 position-relative'])[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Lost Lead')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Rating')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Industry Type')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@class='w-100 bg-transparent border rounded-1 p-1'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Data/Telecom OEM')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//LEAD INFORMATION
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='mb-2 ms-1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='cursorPointer pt-2 ps-1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'raja1@mailinator.com')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadInfoEmail']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadInfoEmail']")).sendKeys("anusha7@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadPhone']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadPhone']")).sendKeys("00001");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadMobile']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadMobile']")).sendKeys("000");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadSource']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Web Research')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='industryType']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Government/Military')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='annualRevenue']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("10");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='website']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='website']")).sendKeys("xyz");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='companyName']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("jkl");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='fax']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("mno");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadStatus']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Attempted to Contact')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='noOfEmployees']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='noOfEmployees']")).sendKeys("10");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='rating']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Shutdown')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='skypeId']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='skypeId']")).sendKeys("pqr");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='twitter']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='twitter']")).sendKeys("stu");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='secondaryEmailId']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='secondaryEmailId']")).sendKeys("anu7@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//ADDRESS INFORMATION
			driver.findElement(By.xpath("//input[@name='country']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='country']")).sendKeys("INDIA");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='state']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("KARNATAKA");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='city']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("BANGALORE");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='street']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='street']")).sendKeys("asdf");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='zipCode']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("234544");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='description']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='description']")).sendKeys("234544sdghhgf");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//NOTES
			driver.findElement(By.xpath("//button[@id='dropdown-note']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[contains(text(),'All')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//textarea[@class='notesClass']")).sendKeys("234544sdghhgf#$%^^%$#fgfdscvfdsf");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='editNoteButton']")).click();
			Thread.sleep(5000);
			//PRODUCTS
			driver.findElement(By.xpath("//button[@class='addProductsButton p-1']")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(5000);	
	}
	static void test_invalid_Overview_Lead1() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'Lokesh RB')])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Owner')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Owner')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='d-flex input-with-clear'])[2]")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg']")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@value='rupu Bam']")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Change Owner')])")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Email Id')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Source')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='w-50 mt-1 ms-5 position-relative'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Seminar Partner')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 '])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Phone Number')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='d-flex editInput_container '])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123565");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Title')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Lead Status')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='w-50 mt-1 ms-5 position-relative'])[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Lost Lead')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Rating')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Industry Type')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@class='w-100 bg-transparent border rounded-1 p-1'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Data/Telecom OEM')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//LEAD INFORMATION
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='mb-2 ms-1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='cursorPointer pt-2 ps-1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'raja1@mailinator.com')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadInfoEmail']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadInfoEmail']")).sendKeys("anusha1@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadPhone']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadPhone']")).sendKeys("#$%^$#@!");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadMobile']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='leadMobile']")).sendKeys("#@$%^&%$#@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadSource']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Web Research')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='industryType']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Government/Military')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='annualRevenue']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("$#%^$#@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='website']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='website']")).sendKeys("@#$%^$#");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='companyName']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("@#$%^$#@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='fax']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("$%^$#@!#$");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='leadStatus']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=' css-1xc3v61-indicatorContainer']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Attempted to Contact')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='noOfEmployees']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='noOfEmployees']")).sendKeys("#$%^$#");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='rating']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Shutdown')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='skypeId']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='skypeId']")).sendKeys("$#^$#^%#@#!");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='twitter']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='twitter']")).sendKeys("#$%^#%#@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='secondaryEmailId']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='secondaryEmailId']")).sendKeys("anu7@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//ADDRESS INFORMATION
			driver.findElement(By.xpath("//input[@name='country']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='country']")).sendKeys("#%$#^%#$");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='state']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("#$%^%$#@$%$#$%");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='city']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("()*&^%$#@#");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='street']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='street']")).sendKeys("@#$%^&*&^%$#");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='zipCode']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("@#$%^&^%$#");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='description']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='description']")).sendKeys("@#$%^&^%$#@$%");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Group 71.de961e5da5c06812614a1ab6e7647c56.svg']")).click();
			Thread.sleep(3000);
			//NOTES
			driver.findElement(By.xpath("//button[@id='dropdown-note']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[contains(text(),'All')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//textarea[@class='notesClass']")).sendKeys("#$%^&U^%$#@$%^&*(");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='editNoteButton']")).click();
			Thread.sleep(5000);
			//PRODUCTS
			driver.findElement(By.xpath("//button[@class='addProductsButton p-1']")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Next')])")).click();
			Thread.sleep(5000);	
	}
	

	static void test_Edit_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='companyName'])")).sendKeys("sdfghjkgfds");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='lastName'])")).sendKeys("sd");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='emailId'])")).sendKeys("mj7@mailinator.com");
			Thread.sleep(5000);
			WebElement button = driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])"));
			button.click();
			//driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])")).click();
			//Thread.sleep(7000);
			
	
	}
	static void test_MassTransfer_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='position-absolute h-100 mass_transfer_user pt-1'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[contains(text(),'raja2@mailinator.com')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);		
	}
	static void test_MassUpdate_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Phone Number')])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("777777777");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])")).click();
			Thread.sleep(2000);		
	}
	static void test_MassDelete_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
			Thread.sleep(5000);	
			//For Next page
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])")).click();
			Thread.sleep(5000);	
			//For Back page
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[1]")).click();
			Thread.sleep(5000);	
			//For Next page
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[2]")).click();
			Thread.sleep(5000);	
	}
	static void test_RecordsPage_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-gz24nq-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'30 Records Per Page')]")).click();
			Thread.sleep(5000);
	}
	static void test_Clone_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'Clone')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("sdfghgfdsad");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("skjhvbn123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("mj1@mailinator.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
			Thread.sleep(6000);	
	}
	static void test_Share_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='public'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Read Write')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Share')])")).click();
			Thread.sleep(5000);		
	}
	static void test__Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(5000);		
	}
	static void test__Arrows_Lead() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//p[contains(text(),'Leads')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),' MJ')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='me-2 cursorPointer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='ms-1 cursorPointer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer'])")).click();
			Thread.sleep(5000);	
			driver.findElement(By.xpath("(//span[@class=' pt-3 cursorPointer w-25'])")).click();
			Thread.sleep(5000);
}
	static void  test_Contactbutton() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			System.out.println("Navigate to Contact page");
			/*WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])"));
			if(button.isEnabled())
			{
				System.out.println("contact button is enabled");
			}
			else 
			{
				System.out.println("contact button is disabled");                          
			}
	}
	static void  test_Contact_Create_button() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Contact')])")).click();
			Thread.sleep(5000);
	}
	static void  test_Contact_CreatePage() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Contact')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'raju@gamil.com')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("anu7@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("@#$%^$#@!#r3r4t5453");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("@#$%^$#@!##$%^$#@");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'tfyrytyt lkjhg')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(5000);		
	}
	static void  test_invalid_Contact_CreatePage() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Create Contact')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'raju@gamil.com')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("anu7@mailinator.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("@#$%^$#@!#r3r4t5453........,,,,,,,,,,");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("@#$%^$#@!##$%^$#@............,,,,,,,,,,");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			//Thread.sleep(5000);	
			WebElement button = driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])"));
			if(button.isEnabled())
			{
				System.out.println("Save button is enabled");
			}
			else 
			{
				System.out.println("Save button is disabled");                          
			}
			
	}
	static void  test_Contact_Edit_Page() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'tfyrytyt lkjhg')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(5000);				
	}
	static void   test_Contact_invalid_Edit_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'dfgfdg dgdfg')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("anu1@mailinator");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(5000);
			System.out.println("Enter valid Date of birth");
			
	}
	
	
	static void  test_Contact_Clone_Page() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://backoffice.chaincrm.io/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']")).sendKeys("anusha123@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@class='loginEmailField']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'tfyrytyt lkjhg')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Edit')])")).click();
			Thread.sleep(5000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			Thread.sleep(5000);
			
	}
	static void  test_Contact_managecolumns_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//img[@src='/static/media/filterMenu.8fdd0cb626dcc038bffc1f1f115e7ecb.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='Description']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='save_btn']")).click();
			Thread.sleep(5000);
			System.out.println("Description column is added successfully");	
	}
	static void  test_Contact_Share_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'RR RRR')])")).click();
			Thread.sleep(5000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Share')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'0 Users')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("(//div[@class=' css-qav5hl-singleValue'])[2]")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Role')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Groups')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Read Write')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])")).click();
			Thread.sleep(5000);
			System.out.println("Shared successfully");	
	}
	static void  test_Contact_Delete_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//td[contains(text(),'Smruti hello rajan')])")).click();
			Thread.sleep(5000);	
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Contact record deleted successfully");
			
	}
	static void  test_Contact_MassTransfer_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[contains(text(),'loki02@mailinator.com')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			System.out.println("Update successfully");
	}
	
	static void  test_Contact_MassUpdate_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Update')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'Annual Revenue')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(5000);
			System.out.println("Update successfully");
	}
	static void  test_Contact_MassDelete_Page() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@id='vehicle1'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(5000);
			System.out.println("Contact record deleted Successfully");
	}
	static void  test_ContactPage_Arrows() throws InterruptedException
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
			driver.findElement(By.xpath("(//p[contains(text(),'Contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Contacts Shared by Me')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Contacts Shared to Me')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'Mailing Labels')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'My contacts')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'New Last week')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();       		 
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='paginationArrowDisable'])")).click();
			Thread.sleep(5000);
	
	}
	static void  test_Account_Button() throws InterruptedException
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
	static void  test_Account_Create_SaveandNew() throws InterruptedException
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
			driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("nsabfjlsdgjf");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			Thread.sleep(3000);
			System.out.println("It will save the data and navigate to new page.");
	}
	static void  test_invalid_Account_Create_SaveandNew() throws InterruptedException
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
			
	static void  test_Account_Create_Save() throws InterruptedException
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
			driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("nsabfjlsdgjf");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])")).click();
			Thread.sleep(3000);
			System.out.println("Account info created Successfully");
	}
	static void  test_Account_Overview() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'gcfghj')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(3000);
	}
	static void  test_Account_Edit() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'gcfghj')])")).click();
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
	static void  test_Account_Clone() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'gcfghj')])")).click();
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
	static void  test_Account_Share() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'gcfghj')])")).click();
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
	static void  test_Account_Delete() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'gcfghj')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Account deleted successfully");	
	}
	static void  test_Account_List() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[contains(text(),'My Accounts')])")).click();
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
	static void  test_Account_MassTransfer() throws InterruptedException
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
	static void  test_Account_MassUpdate() throws InterruptedException
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
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("345643245322345tjvhjkh");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);	
	}	
	static void  test_Account_MassDelete() throws InterruptedException
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
	static void  test_Account_RecordsPerPage() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[contains(text(),'10 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'30 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'40 Records Per Page')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'50 Records Per Page')])")).click();
			Thread.sleep(3000);
			
	}
	static void  test_Account_Filter() throws InterruptedException
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
			driver.findElement(By.xpath("(//th[@class='text-end cursorPointer position-relative'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Manage Columns')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@id='Description'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);		
	}
	static void  test_Account_Pagearrow() throws InterruptedException
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
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[2]")).click();
			Thread.sleep(3000);
	}
	static void  test_Deals_button() throws InterruptedException
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
			//driver.findElement(By.xpath("(//p[contains(text(),'Deals')])")).click();
			//Thread.sleep(3000);
			WebElement button = driver.findElement(By.xpath("(//p[contains(text(),'Deals')])"));
			if(button.isEnabled())
			{
				System.out.println("Deals button is enabled");
			}
			else 
			{
				System.out.println("Deals button is disabled");                          
			}	
	}
	static void  test_Deals_createDeal_saveandnew() throws InterruptedException
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
			driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("sdvsbdzbdcjsjhgfdsdf");
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
			driver.findElement(By.xpath("(//button[contains(text(),'Save and New')])")).click();
			Thread.sleep(3000);
			System.out.println("Deals created Successfully and display new page");	
	}
	static void  test_Deals_createDeal_Save() throws InterruptedException
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
			driver.findElement(By.xpath("//input[@name='dealName']")).sendKeys("sdvsbdzbdcjsjhgfdsdf");
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
			System.out.println("Deals created Successfully");	
	}
	
	
	static void  test_Deals_DealSharedbyme() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Deals Shared by Me')])")).click();
			Thread.sleep(3000);
	}
	static void  test_Deals_Overview() throws InterruptedException
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
			driver.findElement(By.xpath("(//td[contains(text(),'.')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Timeline')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'Overview')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Vector (2).d3c71bca94b397d2e7b4a37cd96e2b5b.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/Vector (1).d3c71bca94b397d2e7b4a37cd96e2b5b.svg'])")).click();
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//img[@src='/static/media/likeDropdownNew.9ea19a1544c32d6b8fa7de4148a46be3.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//li[contains(text(),'Closed Won')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='amount'])[2]")).sendKeys("``````````````````");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/dislikeDropdown.8135244b9722604c996b31d32389ec89.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//li[contains(text(),'Closed Lost')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='amount'])[2]")).sendKeys("``````````````````");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class=' css-d7l1ni-option'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])")).click();
			Thread.sleep(3000);	
	}
	static void  test_Deals_createDeal_Save() throws InterruptedException
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
	static void test_Deals_OverviewStage() throws InterruptedException
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
	static void test_Deals_Edit() throws InterruptedException
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
	static void test_Deals_Clone() throws InterruptedException
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
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Clone')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
			Thread.sleep(3000);	
			System.out.println("Deals created Successfully");
	}
	static void test_Deals_Share() throws InterruptedException
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
			System.out.println("Shared Deals added Successfully");
			
	}
	static void test_Deals_Delete() throws InterruptedException
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
			driver.findElement(By.xpath("(//button[@class='btn btn-secondary bg-white text-dark border border-primary'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Account Deleted successfully");	
	}	
	static void test_Deals_MassTransfer() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Transfer')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[contains(text(),'admin')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Done')])")).click();
			Thread.sleep(3000);
			System.out.println("Updated Successfully");
			
	}
	static void test_Deals_MassDelete() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[contains(text(),'Mass Delete')])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Delete')])")).click();
			Thread.sleep(3000);
			System.out.println("Deals Details deleted Successfully");
	
	}
	static void test_Deals_MassUpdate() throws InterruptedException
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
			driver.findElement(By.xpath("(//input[@id='massValue'])")).sendKeys("32453245321");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Update')])")).click();
			Thread.sleep(3000);
	}
	
	static void test_Deals_recordsperpage() throws InterruptedException
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
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'20 Records Per Page')])")).click();
			Thread.sleep(3000);
			
	}
	static void test_Deals_Arrows() throws InterruptedException
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
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='paginationArrow'])[1]")).click();
			Thread.sleep(3000);	
	}*/
}
