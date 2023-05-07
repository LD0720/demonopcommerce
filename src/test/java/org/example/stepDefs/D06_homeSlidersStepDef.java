package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_sliders;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D06_homeSlidersStepDef {
    P06_sliders slider = new P06_sliders();
    int count = 0;
    @Given("user clicks on the first slider")
    public void clickOnSlider(){
        //click on slider
        List<WebElement> elements = slider.sliderLink();
        elements.get(0).click();
    }

    @Then("the expected website should appear")
    public void theExpectedWebsiteShouldAppear() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(slider.getURL().equals("https://demo.nopcommerce.com/nokia-lumia-1020")||
                slider.getURL().equals("https://demo.nopcommerce.com/iphone-6"));
        softAssert.assertAll();
    }

    @Given("user clicks on the second slider")
    public void userClicksOnTheSecondSlider() {
        List<WebElement> elements = slider.sliderLink();
        elements.get(1).click();
    }
}
