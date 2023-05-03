package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void loginPage(){
        login.loginLink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {
        login.emailBox().sendKeys(arg1);
        login.passwordBox().sendKeys(arg2);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        String url = login.pageURL();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(url,"https://demo.nopcommerce.com/");
        Boolean flag = true;
        try{
        Hooks.driver.findElement(By.className("ico-account"));
        }catch(NoSuchElementException e){
            flag = false;
        }
        softAssert.assertTrue(flag);
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String url = login.pageURL();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(url,"https://demo.nopcommerce.com/");
        Boolean flag = true;
        try{
            Hooks.driver.findElement(By.className("ico-account"));
        }catch(NoSuchElementException e){
            flag = false;
        }
        softAssert.assertFalse(flag);
        softAssert.assertAll();
    }
}
