
package utils;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import base.DriverManager;

public class ScreenshotUtil {

 public static void capture(String name){

  try{
   TakesScreenshot ts = (TakesScreenshot)DriverManager.getDriver();
   File src = ts.getScreenshotAs(OutputType.FILE);

   File dest = new File("screenshots/" + name + ".png");

   FileHandler.copy(src,dest);
  }
  catch(Exception e){
   e.printStackTrace();
  }
 }
}
