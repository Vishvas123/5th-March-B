package testNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
// Implementing Listeners at class level
{
@Override
public void onTestFailure(ITestResult result) {
	Reporter.log("TC is failed, screenshot taken", true);
	ITestListener.super.onTestFailure(result);
}
@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is passed", true);
		ITestListener.super.onTestSuccess(result);
	}
@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("TC is failed,please check dependent TC", true);
		ITestListener.super.onTestSkipped(result);
	}
}
