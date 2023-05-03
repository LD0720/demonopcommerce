package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class P02_login {
    public WebElement loginLink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailBox(){
        return Hooks.driver.findElement(By.className("email"));
    }
    public WebElement passwordBox(){
        return Hooks.driver.findElement(By.className("password"));
    }
    public WebElement loginBtn(){
        return Hooks.driver.findElement(By.className("button-1"));
    }
    public String pageURL(){
        return Hooks.driver.getCurrentUrl();
    }
}
