package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiamearnNegative7 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		/*testEmpty_Email_WithEmpty_Pswd();                 // Signup page
		testspclcharacters_Email_Withpswd();
		testcharacters_Email_Withpswd();
		testvalidation_Email_Withpswd();
		testnumbers_Email_Withpswd();
		testspaces_Email_Withpswd();
		testinvalid_Email_Withpswd();
		testEmail_With_Emptypswd();
		testEmail_With_Characterspswd();
		testEmail_With_Numberspswd();
		testEmail_With_Specialcharactersspswd();
		testEmail_With_Spacespswd();
		testEmail_With_Validationpswd();
		testEmail_With_Minimumpswd();
		testEmail_With_Maximumpswd();
		testEmail_With_Lessthan_Minimumpswd();
		testEmail_With_pswd_WrongOTP();
		testEmptymail_with_emptyPassword_Signin();         // Signin page
		testspclcharacters_Email_Withpswd_Signin();
		testcharacters_Email_Withpswd_Signin();
		testvalidation_Email_Withpswd_Signin();
		testnumbers_Email_Withpswd_Signin();
		testspaces_Email_Withpswd_Signin();
		testinvalid_Email_Withpswd_Signin();
	    testEmail_With_Emptypswd_Signin();
		testEmail_With_Characterspswd_Signin();
	    testEmail_With_Numberspswd_Signin();
	    testEmail_With_Specialcharactersspswd_Sigin(); 
	    testEmail_With_Spacespswd_Signin();
	    testEmail_With_Validationpswd_Signin();
	    testEmail_With_Minimumpswd_Signin(); 
	    testEmail_With_Maximumpswd_Signin(); 
	    testEmail_With_Lessthan_Minimumpswd_Signin(); 
	    testEmail_With_Forgotpswd_Signin();
		testEmail_With_pswd_wrongOTP_Signin();
		testvalidfirstname_profile();                          //Profile page
		testvalidlastname_profile();
		testvalidDetails_profile();
		testvalidDetails2_profile();
		testapply_Bounties();
		testinvalidFname_profile();
		testinvalidLname_profile();
		testinvalidUsername_profile();
		testinvalidDiscordLink_profile();
		testinvalidGithubLink_profile();
		testinvalidLinkedinLink_profile();
		testinvalidTelegramLink_profile();
		testinvalidTwitterLink_profile();
		testinvalidWebsiteLink_profile();
		testinvalidSubmissionLink_Bounties();          //Bounties
		testinvalidTweetLink_Bounties();
		testinvalidWalletAddressLink_Bounties();
		testinvalidSelectionwithaddressLink_Bounties();
		testemptyLink_Bounties();
		testempty_profile();*/
		testBounty_Applications();
		
	}
	//EMPTY MAIL AND PASSWORD IN SIGNUP 
	/*static void testEmpty_Email_WithEmpty_Pswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='signUp_1']")).click();
			Thread.sleep(6000);
			System.out.println("All fields are mandatory");
			
			/*WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	
		//SPECIAL CHARACTERS IN MAIL FIELD AND VALID PASSWORD AT SIGNUP
	static void testspclcharacters_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("@#$%^&^%$#@!#$%");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
			//driver.findElement(By.xpath("//input[@id='signUp_1']")).click();
			//Thread.sleep(6000);

}
	//CHARACTERS IN MAIL FIELD AND VALID PASSWORD IN SIGNUP 
	
	static void testcharacters_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("jsdjfsfhijkdskjghdfj");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	//VALIDATION MAIL FIELD AND VALID PASSWORD IN SIGNUP
	
	static void testvalidation_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("jsdjfsfhijkdskjghdfj#$%^&%$#@$%^&*^%$#@$%^&*^%$#387242364632546324653624573254235432323@#$%^%$#@!#$%^&*^%$#@#$%^&*^%4sjcjkhxzjkbcsadkbcuiebhsfsadhf");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	//NUMBERS IN MAIL FIELD AND VALID PASSWORD IN SIGNUP
	static void testnumbers_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("32847382998476378274645738921874657382974382");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	//SPACES IN MAIL FIELD AND VALID PASSWORD IN SIGNUP
	static void testspaces_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("    ");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	// INVALID MAIL WITH VALID PASSWORD IN SIGNUP
	static void testinvalid_Email_Withpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	//Password field in Signup Page

	//VALID MAIL WITH EMPTY PASSWORD IN SIGNUP
	 
	static void testEmail_With_Emptypswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("");
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	//VALID MAIL WITH CHARACTERS IN PASSWORD FIELD IN SIGNUP
	static void testEmail_With_Characterspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
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
			/*WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	// VALID MAIL WITH NUMBERS IN PASSWORD FIELD IN SIGNUP
	
	static void testEmail_With_Numberspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("21324324324324");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	//VALID MAIL WITH SPECIAL CHARACTERS IN PASSWORD FIELD IN SIGNUP
	static void testEmail_With_Specialcharactersspswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("@#$%^&%$#@$%^&%$#@$%");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	//VALID MAIL WITH SPACES IN PASSWORD FIELD IN SIGNUP
	
	static void testEmail_With_Spacespswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("      ");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	//VALID MAIL WITH VALIDATION IN PASSWORD FIELD IN SIGNUP
	
	static void testEmail_With_Validationpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("hsdfhsdgfjhdsgafhsdaggsahgdhsajhydhasd#$#%^&%$#@!345321468326547826138423658423gdshvd");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	//VALID MAIL WITH MINIMUM PASSOWRD ALLOWED IN PASSWORD FIELD
	
	static void testEmail_With_Minimumpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha@m.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("A1@asdfg");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
			//VALID MAIL WITH MAXIMUM PASSOWRD ALLOWED IN PASSWORD FIELD

	static void testEmail_With_Maximumpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha@m.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("A1@asdfggdsdgjsadhjasdsajhgdhgshaghg");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	//VALID MAIL WITH LESSTHAN MINIMUM ALLOWED PASSWORD IN SIGNUP

	static void testEmail_With_Lessthan_Minimumpswd() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anusha@m.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("A1@asdf");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void testEmail_With_pswd_WrongOTP() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn d_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("signUpEmail")).sendKeys("anu71@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='signUppass1']")).sendKeys("Test@127");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='signUp_1']")).click();
			Thread.sleep(50000);
			driver.findElement(By.xpath("//input[@id='signUp_2']")).click();
			System.out.println("OTP Mismatched");
			/*WebElement button = driver.findElement(By.xpath("//input[@id='signUp_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}	
	
	// LOGIN PAGE
	
	static void testEmptymail_with_emptyPassword_Signin() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("");
			Thread.sleep(1000);
			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testspclcharacters_Email_Withpswd_Signin() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("#$%^&%$#@!@#$%#@!");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");
			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testcharacters_Email_Withpswd_Signin() throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("kjsadabskjhgdjasjks");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testvalidation_Email_Withpswd_Signin()throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("kjsadabskjhgdjasjkshdjhsoifshddhihiwdijweio38473829128376472819736sjdhsgdgushduli@#$%^&*&^%$#@");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testnumbers_Email_Withpswd_Signin()throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("8765432134567898765432345678998765434567890876");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testspaces_Email_Withpswd_Signin()throws InterruptedException
	{
		 WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu    jskdasjk n4356  ");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	static void  testinvalid_Email_Withpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha@#00gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Sorry! No crendentials found");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Emptypswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Characterspswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("sdhafjh");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Numberspswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("sdhafjh");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Specialcharactersspswd_Sigin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("@$#%^$#@!#");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Spacespswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("@$#%^     $#@!#");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Validationpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anusha1@gmail.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("@$#$#@!#hdsfjsfjhwejas#@$%^&%$#@!#$%^&*^%$#@!fdjsgfcjzdjhgdsadjsadjwhdgha#$%675432345643213456");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Sorry! No crendentials found");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Minimumpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Navigate to OTP Verification Page");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Maximumpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@123jhhfghfhjkhgfgjhg");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			System.out.println("Password Mismatched");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Lessthan_Minimumpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@12");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='login_1']")).click();
			//System.out.println("Password Mismatched");

			WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}
	
	static void  testEmail_With_Forgotpswd_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@12");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='forgotPassBtn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("forgotPassEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='forgotPasspass1']")).sendKeys("Test@172");
			
			//driver.findElement(By.xpath("(//i[@class='fa fa-eye-slash password-toggle'])")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='forgotPass_1']")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("//input[@id='forgotPass_2']")).click();

			//System.out.println("Password Mismatched");

			/*WebElement button = driver.findElement(By.xpath("//input[@id='login_1']"));
			if(button.isEnabled())
			{
				System.out.println("Continue button is enabled");
			}
			else 
			{
				System.out.println("Continue button is disabled");
			}
	}	
	
	static void  testEmail_With_pswd_wrongOTP_Signin()throws InterruptedException
	{
		 	WebDriver driver;
			driver = new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
			driver.get("https://products.blockstack.tech/earndiam/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
			Thread.sleep(100);
			driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@172");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login_1']")).click();
			Thread.sleep(50000);
			driver.findElement(By.xpath("//input[@id='login_2']")).click();
			System.out.println("OTP Mismatched");
	}
             //PROFILE PAGE
static void  testvalidfirstname_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@172");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory fields");


		//a[@href='./profile.php']
}

static void  testvalidlastname_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@172");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("jagadeesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
}

static void  testvalidDetails_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu7@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@172");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("jagadeesh");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha m j");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='72']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='file-input']")).sendKeys("C:\\Users\\AnushaM\\Desktop\\001.png");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		//System.out.println("Please fill mandatory field");
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
}
static void  testvalidDetails2_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu71@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@120");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("profileFname")).sendKeys("anu");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("m");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha m j");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='72']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='file-input']")).sendKeys("C:\\Users\\AnushaM\\Desktop\\001.png");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username/project-name");
		Thread.sleep(2000);
		driver.findElement(By.id("linkedIn")).sendKeys("https://www.linkedin.com/in/firstname-lastname");
		Thread.sleep(2000);
		driver.findElement(By.id("telegram")).sendKeys("https://t.me/username");
		Thread.sleep(2000);
		driver.findElement(By.id("twitter")).sendKeys("https://twitter.com/username");
		Thread.sleep(2000);
		driver.findElement(By.id("website")).sendKeys("https://www.example.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
}

static void  testapply_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu71@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@120");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("https://drive.google.com/file/d/1234567890abcdef/view");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tweetLink']")).sendKeys("https://x.com/elonmusk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='anythingElse']")).sendKeys("https://x.com/elonmusk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='walletAddress']")).sendKeys("0x4c9630397E08C8b54375ad8608025Db7c7026840");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='bountySubBtn']")).click();
		Thread.sleep(2000);
}
//NEGATIVE TEST CASEES FOR PROFILE PAGE
static void  testinvalidFname_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		//.findElement(By.id("profileLname")).sendKeys("jagadeesh");
		//Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
}

static void  testinvalidLname_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
}
static void  testinvalidUsername_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		//System.out.println("Please fill mandatory field");
}
static void  testinvalidDiscordLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
		
		
}
static void  testinvalidGithubLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username214213421344#@$5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
		
		
}
static void  testinvalidLinkedinLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username214213421344#@$5");
		Thread.sleep(2000);
		driver.findElement(By.id("linkedIn")).sendKeys("https://www.linkedin.com/in/8726364@#$%^");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
		
		
}
static void  testinvalidTelegramLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username214213421344#@$5");
		Thread.sleep(2000);
		driver.findElement(By.id("linkedIn")).sendKeys("https://www.linkedin.com/in/8726364@#$%^");
		Thread.sleep(2000);
		driver.findElement(By.id("telegram")).sendKeys("https://t.me/2736#@$%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
		
		
}
static void  testinvalidTwitterLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username214213421344#@$5");
		Thread.sleep(2000);
		driver.findElement(By.id("linkedIn")).sendKeys("https://www.linkedin.com/in/8726364@#$%^");
		Thread.sleep(2000);
		driver.findElement(By.id("telegram")).sendKeys("https://t.me/2736#@$%");
		Thread.sleep(2000);
		driver.findElement(By.id("twitter")).sendKeys("https://twitter.com/@#234324*");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory field");
		
		
}
static void  testinvalidWebsiteLink_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src='./assets/images/user-placeholder.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='./profile.php']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("profileFname")).sendKeys("anusha@#$%^$#@$");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("@#$%^UI*&^%$");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Anusha234532@!#$%^$#@");
		Thread.sleep(2000);
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		driver.findElement(By.xpath("//img[@src='./assets/images/next-icon.svg']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("discord")).sendKeys("ShadowNinja#$%^$#@r342424532");
		Thread.sleep(2000);
		driver.findElement(By.id("github")).sendKeys("https://github.com/username214213421344#@$5");
		Thread.sleep(2000);
		driver.findElement(By.id("linkedIn")).sendKeys("https://www.linkedin.com/in/8726364@#$%^");
		Thread.sleep(2000);
		driver.findElement(By.id("telegram")).sendKeys("https://t.me/2736#@$%");
		Thread.sleep(2000);
		driver.findElement(By.id("twitter")).sendKeys("https://twitter.com/@#234324*");
		Thread.sleep(2000);
		driver.findElement(By.id("website")).sendKeys("https://www.example@#$3sfdwe4rA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_2']")).click();
		Thread.sleep(2000);
		System.out.println("Social media Details added successfully");
		
		
}

static void  testinvalidSubmissionLink_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("https://drive.google.com/file/d/1234567890abcdef/$#%#@!#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bountySubBtn']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory fields");
		

}
static void  testinvalidTweetLink_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("https://drive.google.com/file/d/1234567890abcdef/$#%#@!#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tweetLink']")).sendKeys("https://twitter.com/username/status/123456789@#$");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//input[@id='bountySubBtn']"));
		if(button.isEnabled())
		{
			System.out.println("Submit button is enabled");
		}
		else 
		{
			System.out.println("Submit button is disabled");
		}
		//driver.findElement(By.xpath("//input[@id='bountySubBtn']")).click();
		//Thread.sleep(2000);
		//System.out.println("Please fill mandatory fields");
		

}
static void  testinvalidWalletAddressLink_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("https://drive.google.com/file/d/1234567890abcdef/$#%#@!#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tweetLink']")).sendKeys("https://twitter.com/username/status/123456789@#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='walletAddress']")).sendKeys("0x4c9630397E08C8b54375ad8608025Db7c702684#$@$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bountySubBtn']")).click();
		Thread.sleep(2000);
		System.out.println("Please enter a valid wallet address");
}
static void  testinvalidSelectionwithaddressLink_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("https://drive.google.com/file/d/1234567890abcdef/$#%#@!#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tweetLink']")).sendKeys("https://twitter.com/username/status/123456789@#$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='walletAddress']")).sendKeys("0x4c9630397E08C8b54375ad8608025Db7c702684#$@$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bountySubBtn']")).click();
		Thread.sleep(2000);
		System.out.println("Please enter a valid wallet address");
}
static void  testemptyLink_Bounties()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu714@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bounties')])")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//small[contains(text(),'by Charan')])")).click();
		driver.findElement(By.xpath("//img[@src='https://diam-ico.s3.us-west-1.amazonaws.com/icon__1717415116.']")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'StepN Feedback')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='bountySubmissionBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submissionLink']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tweetLink']")).sendKeys("");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-customSelect']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[@data-index='']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='walletAddress']")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='bountySubBtn']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory fields");
}
static void  testempty_profile()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu716@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@713");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Profile')])")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profileFname")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("profileLname")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='profileForm_1']")).click();
		Thread.sleep(2000);
		System.out.println("Please fill mandatory fields");
		/*WebElement button = driver.findElement(By.xpath("//input[@id='profileForm_1']"));
		if(button.isEnabled())
		{
			System.out.println("Continue button is enabled");
		}
		else 
		{
			System.out.println("Continue button is disabled");
		}
		
}*/
static void  testBounty_Applications()throws InterruptedException
{
	 	WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","path/to/chromedriver");
		driver.get("https://products.blockstack.tech/earndiam/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='c_btn l_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("anu71@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='loginpass']")).sendKeys("Test@120");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login_1']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//input[@id='login_2']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@class='profileNametext']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),' Bounty Applications')])")).click();
		Thread.sleep(5000);	
		
}
}




	
	
	
	
	
	
	











	
	
	
	
	
	
	






