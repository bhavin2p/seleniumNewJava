package windowDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		String mainWindow = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		Iterator<String> itr = allWindowHandles.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is "+text.getText());
				driver.close();
				System.out.println("Child window closed");
			}
			
			
		}
		driver.switchTo().window(mainWindow);
		driver.quit();

	}

}
