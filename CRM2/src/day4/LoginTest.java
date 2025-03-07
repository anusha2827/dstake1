package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testValidMailAndPassword() throws InterruptedException {
        driver.get("https://backoffice.chaincrm.io/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='loginEmailField mb-5 ps-3']"))
              .sendKeys("anusha123@mailinator.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@class='loginEmailField']"))
              .sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-4']")).click();
        Thread.sleep(6000);
        System.out.println("Navigates to CRM Home page");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

