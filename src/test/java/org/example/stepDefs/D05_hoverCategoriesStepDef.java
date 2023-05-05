package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hover;
import org.openqa.selenium.WebElement;

public class D05_hoverCategoriesStepDef {
    P05_hover hover = new P05_hover();
    @When("hovering over a category")
    public void HoverOverCategory(){

    }

    @And("choosing a sub category")
    public void choosingASubCategory() {
    }

    @Then("the sub category title should be relevant to the category")
    public void theSubCategoryTitleShouldBeRelevantToTheCategory() {
    }
}
