
package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

 public void onTestFailure(ITestResult result){
  ScreenshotUtil.capture(result.getName());
 }

}
