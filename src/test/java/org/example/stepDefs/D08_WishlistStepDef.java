package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.time.Duration;

public class D08_WishlistStepDef {
    P08_Wishlist wishlist = new P08_Wishlist();
    @Given("user click on add to wishlist")
    public void clickOnAddToWishlist(){
        System.out.println("Entered clickOnAddToWishlist");
        wishlist.addToWishlistLink().click();
    }

    @Then("success message will appear with a green background")
    public void successMessageWillAppearWithAGreenBackground() {
        WebElement element = Hooks.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
        SoftAssert softAssert = new SoftAssert();
        System.out.println(element.getText());
        System.out.println(element.getText().equals("The product has been added to your wishlist"));
        softAssert.assertTrue(element.getText().equals("The product has been added to your wishlist"));
        System.out.println(element.getCssValue("background-color"));
        System.out.println(element.getCssValue("background-color").equalsIgnoreCase("rgba(75, 176, 122, 1)"));
        softAssert.assertTrue(element.getCssValue("background-color").equalsIgnoreCase("rgba(75, 176, 122, 1)"));
        softAssert.assertAll();
    }

    @When("success message appear wait")
    public void successMessageAppearWait() {
        System.out.println("Entered successMessageAppearWait");
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='bar-notification success']")));
    }

    @And("user clicks on wishlist button")
    public void userClicksOnWishlistButton()
    {
        System.out.println("Entered userClicksOnWishlistButton ");
        wishlist.wishlistButton().click();
    }

    @Then("quantity is bigger than one")
    public void quantityIsBiggerThanOne() {
        System.out.println("Entered quantityIsBiggerThanOne ");
       WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[class='quantity']")));
        System.out.println(wishlist.quantityBox().getAttribute("value"));
      int quantity =  Integer.parseInt(wishlist.quantityBox().getAttribute("value"));
        System.out.println("Quantity : " + quantity);
      SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(quantity>0 );
      softAssert.assertAll();
    }
}
