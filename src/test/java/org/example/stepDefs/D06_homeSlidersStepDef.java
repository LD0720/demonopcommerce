package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_sliders;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class D06_homeSlidersStepDef {
    P06_sliders slider = new P06_sliders();
    @Given("user clicks on the first slider")
    public void clickOnSlider(){
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> elements = slider.sliderLink();
        elements.get(1).click();
    }
}
