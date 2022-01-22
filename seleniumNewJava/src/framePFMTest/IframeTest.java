package framePFMTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framePFMObjects.IframeObjexts;

public class IframeTest {
	
	String driverPath = "C:\\Users\\bhpanchal\\"
			+ "OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	String link = "http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/";
	
	IframeObjexts frameObj;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(link);
	}
	
	@Test(priority = 1)
	public void switchFrame() throws InterruptedException {
		frameObj = new IframeObjexts(driver);
		frameObj.switchToFrame();
	}
	
	@Test(priority = 2)
	public void switchDefault() throws InterruptedException
	{
		frameObj = new IframeObjexts(driver);
		frameObj.switchDefault();
		frameObj.clickLink();
	}
	
	@AfterTest
	public void tearDown() {
		frameObj = new IframeObjexts(driver);
		frameObj.tearDown();
	}

}
