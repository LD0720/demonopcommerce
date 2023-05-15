package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hover;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    P05_hover hover = new P05_hover();
    String SelectedCategoryName;
    int SelectedCategoryIndex;
    List<WebElement> mainLinks;
    int max;
    int min;

    @Given("hovering over a category")
    public void hoverCategory() throws InterruptedException {
        Actions actions = new Actions(Hooks.driver);
        mainLinks = hover.getCategoriesList();
        int count = mainLinks.size();

        min = 0;
        max = count - 1;
        SelectedCategoryIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
        actions.moveToElement(mainLinks.get(SelectedCategoryIndex)).perform();
        SelectedCategoryName = mainLinks.get(SelectedCategoryIndex).getText();
        Thread.sleep(2000);
    }

    @When("choosing a sub category")
    public void choosingASubCategory() {
        SelectedCategoryIndex += 1;
        String locator = "(//ul[@class='top-menu notmobile']//ul)[" + SelectedCategoryIndex + "]/li";
        List<WebElement> subCategoryLinks = hover.getSubCategoryList(locator);
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        min = 0;
        max = subCategoryLinks.size()-1;
        if (!subCategoryLinks.isEmpty()) {
            int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
            subCategoryLinks.get(selectedSubCategory).click();
        } else {
            mainLinks.get(SelectedCategoryIndex-1).click();
        }
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("the sub category title should be relevant to the category")
    public void theSubCategoryTitleShouldBeRelevantToTheCategory() {
        SoftAssert softAssert = new SoftAssert();
        String title = hover.getTitle().getText().toLowerCase().trim();
        softAssert.assertTrue(SelectedCategoryName.toLowerCase().trim().contains(title));
        softAssert.assertAll();
    }
}
