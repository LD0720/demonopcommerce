package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_Wishlist {
    public WebElement addToWishlistLink(){
        return Hooks.driver.findElement(By.cssSelector("body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)"));
    }
    public WebElement wishlistButton(){
        return Hooks.driver.findElement(By.xpath("//span[@class='wishlist-label']"));
    }
    public WebElement quantityBox(){
       return Hooks.driver.findElement(By.className("qty-input"));
    }

}
