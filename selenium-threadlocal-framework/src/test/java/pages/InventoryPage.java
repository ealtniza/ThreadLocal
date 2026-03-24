
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverManager;

public class InventoryPage {

 WebDriver driver = DriverManager.getDriver();

 By backpack = By.id("add-to-cart-sauce-labs-backpack");
 By bike = By.id("add-to-cart-sauce-labs-bike-light");

 public void addBackpack(){
  driver.findElement(backpack).click();
 }

 public void addBike(){
  driver.findElement(bike).click();
 }

}
