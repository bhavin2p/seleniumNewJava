package testNGListenerConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListener extends Base implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
	
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
	
	



	
	

}
