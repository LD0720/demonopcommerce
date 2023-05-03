package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerLink() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement GenderButton() {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstNameTextBox() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameTextBox() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement emailTextBox() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordTextBox() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPasswordTextBox() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement verifyRegistration(){
        return  Hooks.driver.findElement(By.className("result"));
    }

}
