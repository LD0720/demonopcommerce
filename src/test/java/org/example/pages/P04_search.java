package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_search {
    public WebElement searchBoxLink(){
        return Hooks.driver.findElement(By.className("search-box-text"));
    }
    public WebElement searchBtn(){
        return Hooks.driver.findElement(By.className("search-box-button"));
    }
    public List<WebElement> results(){
        return Hooks.driver.findElements(By.className("product-title"));
    }
    public List<WebElement> resultPictures(){
        return Hooks.driver.findElements(By.className("picture"));
    }

    public String pageURL(){
        return Hooks.driver.getCurrentUrl();
    }

}
