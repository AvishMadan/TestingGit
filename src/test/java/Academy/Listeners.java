package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import resources.base;

public class Listeners extends base implements ITestListener {
	ExtentTest test;
	ExtentReports extent=new ExtentReports("C:\\Users\\LENOVO\\eclipse-workspace\\printTheData\\reports"+"\\ExtentReportResults1.html");
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= extent.startTest(result.getMethod().getMethodName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Test Passed");
		test.log(LogStatus.PASS, "Second guy");
		test.log(LogStatus.PASS, "First guy");
		
=======
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		test.log(LogStatus.PASS, "Second guy second time");
		
		
		
	
	
	}
	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//Screenshot
		test.log(LogStatus.FAIL,"Fail",result.getThrowable());
		WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		String testMethodName1 =result.getMethod().getMethodName();
		
		try {
			
			
			
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		try {
			test.log(LogStatus.FAIL, test.addScreenCapture(getScreenShotPath(testMethodName,driver))); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
