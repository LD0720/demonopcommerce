package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    public WebElement dopdownListlink(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement euroLink(){
        return Hooks.driver.findElement(By.name("customerCurrency"));
    }
    public List<WebElement> elementsOnScreen(){
        return Hooks.driver.findElements(By.className("actual-price"));
    }
}
