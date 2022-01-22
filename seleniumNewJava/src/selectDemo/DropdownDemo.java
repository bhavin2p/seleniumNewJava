package selectDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByValue("ARGENTINA");
		
		List<WebElement> options = drpCountry.getOptions();
		
		for(WebElement we1 : options) {
			System.out.println(we1.getText());
			String check = "CHINA";
			if(check.equalsIgnoreCase(we1.getText())){
				drpCountry.selectByVisibleText("CHINA");
			}
		}
		
		Iterator<WebElement> we = options.iterator();
		while(we.hasNext()) {
			WebElement text1 = we.next();
			System.out.println(text1.getText());
			if("India".equalsIgnoreCase(text1.getText())) {
				drpCountry.selectByVisibleText("INDIA");
			}
		}
		
		Thread.sleep(2000);
		System.out.println(drpCountry.getFirstSelectedOption());
		
		System.out.println(drpCountry.isMultiple());
		
		System.out.println(drpCountry.getOptions());
		
		driver.quit();

	}

}
