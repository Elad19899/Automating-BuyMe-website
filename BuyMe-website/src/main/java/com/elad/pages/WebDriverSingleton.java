package com.elad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    public static WebDriver getInstance(String driverType) {
        if (driver == null) {
            if (driverType.equals("Chrome")) {
                System.out.println("chrome eran appel");
                System.setProperty("webdriver.chrome.driver", "/Users/eladyerushalmi/QA Experts/Drivers/chromedriver");
                driver = new ChromeDriver();
            }
            if (driverType.equals("Firefox")) {
                System.setProperty("webdriver.chrome.driver", "/Users/eladyerushalmi/QA Experts/Drivers/chromedriver");
                driver = new FirefoxDriver();
            }

        }
        return driver;
    }

}
