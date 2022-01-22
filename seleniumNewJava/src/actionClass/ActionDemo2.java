package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
		Actions act = new Actions(driver);
		
		//WebElement element = driver.findElement(By.xpath("//div/a[@title='Live']"));
		//WebElement automate = driver.findElement(By.xpath("//div/a[@title='Automate']"));
		//act.moveToElement(element).perform();
		//act.click(automate).perform();
		WebElement double1 = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		
		act.doubleClick(double1).perform();
		act.contextClick().perform();
		
		
		
	}

}
