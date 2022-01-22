package screenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotProg {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File sourceSnap = scrshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceSnap, new File("C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Workspace\\seleniumNewJava\\screenshots\\snap.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}
