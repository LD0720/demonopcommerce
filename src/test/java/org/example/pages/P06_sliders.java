package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_sliders {
    public List<WebElement> sliderLink(){
        return Hooks.driver.findElements(By.className("nivo-imageLink"));
    }
    public String getURL(){
        return Hooks.driver.getCurrentUrl();
    }
}
