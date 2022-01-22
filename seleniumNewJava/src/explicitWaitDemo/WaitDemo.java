package explicitWaitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WaitDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		//WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		//signIn.click();
		WebElement emailID = driver.findElement(By.xpath("//input[@type='email']"));
		emailID.sendKeys("dummy@gmail.com");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and contains(text(), 'Next')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
