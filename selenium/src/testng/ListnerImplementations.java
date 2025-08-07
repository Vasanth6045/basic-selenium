package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementations extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test script pass",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test script fail",true);
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/demowebshop.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test script skipped",true);
	}
	
}
