package framePFMObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframeObjexts {

	WebDriver driver;
	
	@FindBy(tagName="iframe")
	public List<WebElement> frameElements;
	
	@FindBy(xpath="//div[@id='subscribeBox']//iframe[1]")
	WebElement frameName;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement inputName;
	
	@FindBy(xpath="//div[@id='capSubnav']/a[contains(text(),'Education Center')]")
	WebElement educationLink;
	
	public IframeObjexts(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void numberOfFrames() {
		//List<WebElement> noOfFrames = driver.findElements();
	}
	
	public void switchToFrame() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame(frameName);
		inputName.sendKeys("TestFrame");
		
	}
	
	public void switchDefault()
	{
		driver.switchTo().defaultContent();
		System.out.println("Back to default frame");
	}
	
	public void clickLink() throws InterruptedException {
		Thread.sleep(3000);
		educationLink.click();
		Thread.sleep(2000);
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
}
