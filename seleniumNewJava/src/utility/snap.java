package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class snap {
		
	public static void CaptureScreenshot(WebDriver driver) {
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Selenium\\screenshot_" +captureDateTime()+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String captureDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}

}
