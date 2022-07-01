package testNGListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClassForScreenshotUsingListener;

public class Listener1 implements ITestListener{
	BaseClassForScreenshotUsingListener b= new BaseClassForScreenshotUsingListener();
  @Override
  public void onTestFailure(ITestResult result) 
  {
	  String TCname = result.getName();
	  try {
		b.takescreenshot(TCname);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Override
public void onTestFailedWithTimeout(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestFailedWithTimeout(result);
}
  @Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is passed", true);
	ITestListener.super.onTestSuccess(result);
	Reporter.log("Passed TC name is "+result.getName(), true);
}
  @Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("TC is skipped,please check depemdant TC", true);
	Reporter.log("Skipped TC name is" + result.getName(), true);
	ITestListener.super.onTestSkipped(result);
}
  
}
