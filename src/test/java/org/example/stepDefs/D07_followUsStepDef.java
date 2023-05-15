package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_follow;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

 P07_follow follows = new P07_follow();
   ArrayList<String> tabs ;

    @Given("user clicks on facebook icon")
    public void openFacebookLink(){
        tabs = new ArrayList<>();
      follows.facebookLink().click();

    }

    @Then("the facebook website appears")
    public void theFacebookWebsiteAppears() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        tabs.addAll(Hooks.driver.getWindowHandles());
        System.out.println(tabs);
        Hooks.driver.switchTo().window(tabs.get(1));
        SoftAssert softAssert =new SoftAssert();
        System.out.println("Facebook : ");
        System.out.println("Tab 0 : " + tabs.get(0));
        System.out.println("Tab 1 : " +tabs.get(1));
        System.out.println("Current url : " +Hooks.driver.getCurrentUrl() );
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().equals("https://web.facebook.com/nopCommerce?_rdc=1&_rdr"));
        softAssert.assertAll();
    }

    @Then("the twitter website appears")
    public void theTwitterWebsiteAppears() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        tabs.addAll(Hooks.driver.getWindowHandles());
        System.out.println(tabs);
        Hooks.driver.switchTo().window(tabs.get(1));
        SoftAssert softAssert =new SoftAssert();
        System.out.println("Twitter : ");
        System.out.println("Tab 0 : " + tabs.get(0));
        System.out.println("Tab 1 : " +tabs.get(1));
        System.out.println("Current url : " +Hooks.driver.getCurrentUrl() );
        softAssert.assertTrue(follows.getURL().equals("https://twitter.com/nopCommerce"));
        softAssert.assertAll();
    }

    @Given("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        tabs = new ArrayList<>();
       follows.rssLink().click();

    }

    @Then("the rss website appears")
    public void theRssWebsiteAppears() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        tabs.addAll(Hooks.driver.getWindowHandles());
        System.out.println(tabs);
        Hooks.driver.switchTo().window(tabs.get(1));
        SoftAssert softAssert =new SoftAssert();
        System.out.println("RSS : ");
        System.out.println("Tab 0 : " + tabs.get(0));
        System.out.println("Tab 1 : " +tabs.get(1));
        System.out.println("Current url : " +Hooks.driver.getCurrentUrl() );
        softAssert.assertTrue( follows.getURL().equals("https://demo.nopcommerce.com/new-online-store-is-open"));
        softAssert.assertAll();
    }

    @Given("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        tabs = new ArrayList<>();
       follows.youtubeLink().click();


    }

    @Then("the youtube website appears")
    public void theYoutubeWebsiteAppears() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        tabs.addAll(Hooks.driver.getWindowHandles());
        System.out.println(tabs);
        Hooks.driver.switchTo().window(tabs.get(1));
        SoftAssert softAssert =new SoftAssert();
        System.out.println("youtube : ");
        System.out.println("Tab 0 : " + tabs.get(0));
        System.out.println("Tab 1 : " +tabs.get(1));
        System.out.println("Current url : " +Hooks.driver.getCurrentUrl() );
        softAssert.assertTrue(follows.getURL().equals("https://www.youtube.com/user/nopCommerce"));
        softAssert.assertAll();
    }

   @Given("user clicks on twitter icon")
   public void userClicksOnTwitterIcon() {
       tabs = new ArrayList<>();
       follows.twitterLink().click();
   }
}
