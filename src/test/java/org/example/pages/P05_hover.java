package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_hover {
    public List<WebElement> getCategoriesList(){
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));

    }
    public List<WebElement> getSubCategoryList(String l){
        return Hooks.driver.findElements(By.xpath(l));
    }
    public WebElement getTitle() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}
