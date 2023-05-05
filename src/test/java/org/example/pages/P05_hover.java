package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_hover {
    public List<WebElement> getCategoriesList(){
        return Hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//"));
    }
    public List<WebElement> getSubCategoryList(){
        return Hooks.driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[1]//ul"));
    }
    public WebElement getTitle(){
        return Hooks.driver.findElement(By.className("page-title"));
    }
}
