package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage() {
       // System.out.println("This is a test before start coding");
       /* WebElement registerBtn = Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        registerBtn.click();*/
        register.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.GenderButton().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.firstNameTextBox().sendKeys(arg0);
        register.lastNameTextBox().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(20);
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByVisibleText("July");
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("2002");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.emailTextBox().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.passwordTextBox().sendKeys(arg0);
        register.confirmPasswordTextBox().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.RegisterBtn().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String actualSuccessMsg = Hooks.driver.findElement(By.cssSelector("div[class=\"page-body\"]")).getText();
        String expectedSuccessMsg = "Your registration completed";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualSuccessMsg.contains(expectedSuccessMsg));
        softAssert.assertAll();
    }
}
