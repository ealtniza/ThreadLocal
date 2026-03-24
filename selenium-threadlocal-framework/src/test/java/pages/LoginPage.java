
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class LoginPage {

 WebDriver driver = DriverManager.getDriver();

 By username = By.id("user-name");
 By password = By.id("password");
 By loginBtn = By.id("login-button");

 public void login(String user,String pass){

  driver.findElement(username).sendKeys(user);
  driver.findElement(password).sendKeys(pass);
  driver.findElement(loginBtn).click();

 }

}
