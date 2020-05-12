package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class itestlistnerspractice implements ITestListener{

	public void onFinish(ITestContext result) {
		System.out.println("*********test completed:"+result.getName());
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*******test failed:"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****test skipped"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("******test started"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****test success:"+result.getName());
		
	}

}
