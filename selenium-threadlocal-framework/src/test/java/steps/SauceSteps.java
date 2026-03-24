
package steps;

import base.BaseTest;
import base.DriverManager;
import io.cucumber.java.en.*;
import pages.*;

public class SauceSteps {

 LoginPage login = new LoginPage();
 InventoryPage inventory = new InventoryPage();
 CartPage cart = new CartPage();

 @Given("user launches {string} browser")
 public void launchBrowser(String browser){
  BaseTest.initDriver(browser);
 }

 @When("user logs in")
 public void login(){
  login.login("standard_user","secret_sauce");
 }

 @Then("user adds products")
 public void addProducts(){
  inventory.addBackpack();
  inventory.addBike();
 }

 @Then("user opens cart")
 public void openCart(){
  cart.openCart();
  DriverManager.quit();
 }

}
