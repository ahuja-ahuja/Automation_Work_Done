package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import browser.Initialization;
import seleniumUtil.SeleniumUtil;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase"+ result.getName()+"has been started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase"+ result.getName()+"has been Passed");
		SeleniumUtil.capturescreen(Initialization.driver,result.getName(),"SUCCESS");
		
	}







	

}
