package testNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void Setup() {
		initialization();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}

	
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}


}
