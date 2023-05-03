package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user navigate to website")
    public void navigateToWebsite(){

    }

    @When("user clicks on dropdown list")
    public void userClicksOnDropdownList() {
        home.dopdownListlink().click();
    }

    @And("user chooses euro")
    public void userChoosesEuro() {
        Select select = new Select(home.euroLink());
        select.selectByIndex(1);
    }

    @Then("all elements' price on screen will contains the euro sign")
    public void allElementsPriceOnScreenWillContainsTheEuroSign() {
        List<WebElement> elements = home.elementsOnScreen();

        for(int i=0; i < elements.size(); i++){
            Assert.assertTrue(elements.get(i).getText().contains("€"));
        }
    }
}
