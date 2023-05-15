package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_follow {
    public WebElement facebookLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href='http://www.facebook.com/nopCommerce']"));
    }
    public WebElement twitterLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href='https://twitter.com/nopCommerce']"));
    }
    public WebElement youtubeLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href='http://www.youtube.com/user/nopCommerce']"));
    }
    public WebElement rssLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href='/news/rss/1']"));
    }
    public String getURL (){
        return Hooks.driver.getCurrentUrl();
    }
}
