package frameDemo;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.snap;

public class IframeDemo {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("The number of IFrames on this web page are : " +numberOfTags);
		WebElement frameName = driver.findElement(By.xpath("//div[@id='subscribeBox']//iframe[1]"));
		driver.switchTo().frame(frameName);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("TestFrame");
		Thread.sleep(2000);
	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@id='capSubnav']/a[contains(text(),'Education Center')]")).click();
		
		System.out.println("Click outside of the frame using default Content");
		Thread.sleep(2000);
		snap.CaptureScreenshot(driver);
		/*TakesScreenshot scrShot = (TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\screenshot.png"));
		*/
		
		driver.quit();
		
	}
	

}
