package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
	Actions act;
	
	@Test
	public void DranndDrop() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//Bank
		WebElement from1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		//Sales
		WebElement from2 = driver.findElement(By.xpath("//*[@id='credit1']/a"));
		WebElement To2 = driver.findElement(By.xpath("//*[@id='loan']/li"));
		
		WebElement from3 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement To3 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		WebElement from4 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement To4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		
		act = new Actions(driver);
		act.dragAndDrop(from1, To1).perform();
		
		act.dragAndDrop(from2, To2).perform();
		
		act.dragAndDrop(from3, To3).perform();
		
		act.dragAndDrop(from4, To4).perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).isDisplayed()){
			System.out.println("Perfect Displayed");
		}
		else
		{
			System.out.println("Perfect not Displayed !!!");
		}
	}

}
