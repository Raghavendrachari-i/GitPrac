package Framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success Occurred");;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure Occurred");;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped");;
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed with some percent of failure within success zone");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test failed by Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test On Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test On Finish");
	}
	
	

}
