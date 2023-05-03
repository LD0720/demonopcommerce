package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P04_search search = new P04_search();
    String searchName;
/*
    @Given("user navigate to website")
    public void navigateToWebsite(){

    }
*/

     @When("user click on search box")
    public void userClickOnSearchBox() {
        search.searchBoxLink().click();
    }


    @And("user write the product name as {string}")
    public void userWriteTheProductNameAs(String arg0) {
        search.searchBoxLink().sendKeys(arg0);
        searchName = arg0;
    }

    @And("click search")
    public void clickSearch() {
        search.searchBtn().click();
    }

    @And("user write the sku as {string}")
    public void userWriteTheSkuAs(String arg0) {
        search.searchBoxLink().sendKeys(arg0);
        searchName = arg0;
    }


    @Then("right results should appear based on sku")
    public void rightResultsShouldAppearBasedOnSku() throws InterruptedException {
        List<WebElement> elementList = search.resultPictures();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(search.pageURL().contains("https://demo.nopcommerce.com/search?q="));
        System.out.println("URL is correct:  "+search.pageURL().contains("https://demo.nopcommerce.com/search?q="));
        for(WebElement element : elementList){
            System.out.println("Attribute " +element+ ":     "+ element.getText());
            element.click();
            Thread.sleep(1000);
            System.out.println("SKU : "+ Hooks.driver.findElement(By.className("value")).getText());
            Assert.assertTrue(Hooks.driver.findElement(By.className("value")).getText().contains(searchName));
            Hooks.driver.navigate().back();
        }
    }

    @Then("right results should appear based on product name")
    public void rightResultsShouldAppearBasedOnProductName() {
        List<WebElement> elementList = search.results();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(search.pageURL().contains("https://demo.nopcommerce.com/search?q="));
        System.out.println("URL is correct:  "+search.pageURL().contains("https://demo.nopcommerce.com/search?q="));
        for(WebElement element : elementList){
            System.out.println("Attribute " +element+ ":     "+ element.getText());
            softAssert.assertTrue(element.getText().toLowerCase().contains(searchName));
            softAssert.assertAll();
        }
    }
}
