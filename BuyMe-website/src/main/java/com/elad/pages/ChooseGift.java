package com.elad.pages;

import org.openqa.selenium.WebDriver;

public class ChooseGift {

    private static org.testng.Assert Assert;

    public static void webPageChangeCheck(WebDriver driver) {
        Assert.assertEquals("https://buyme.co.il/search?budget=2&category=5&region=13", driver.getCurrentUrl());
    }

    // this function will pick a buisness
    public static void pickBuisness(WebDriver driver) {
        driver.findElements(Constants.RESTRANT_ID).get(2).click();
        driver.findElement(Constants.PRICE_ID).sendKeys("500");
        driver.findElements(Constants.SUBMIT_PRICE_ID).get(1).click();


    }

}
