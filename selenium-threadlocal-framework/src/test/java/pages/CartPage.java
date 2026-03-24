
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class CartPage {

 WebDriver driver = DriverManager.getDriver();

 By cart = By.className("shopping_cart_link");

 public void openCart(){
  driver.findElement(cart).click();
 }

}
