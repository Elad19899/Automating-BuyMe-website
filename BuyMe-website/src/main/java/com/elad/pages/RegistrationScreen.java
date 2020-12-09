package com.elad.pages;

import org.openqa.selenium.WebDriver;


public class RegistrationScreen {
    //this function will open registration form
    public static void Open_Registration(WebDriver driver) {
        driver.findElement(Constants.SIGNUP_BUTTON_ID).click(); //click login button
        driver.findElement(Constants.REGISTRATION_BUTTON_ID).click();
        driver.findElement(Constants.LOGIN_BUTTON_ID).click();

    }

    //this function will fill registration form
    public static void Fill_Registration_form(WebDriver driver) {

        fillRegistrationForm(driver);
        driver.findElement(Constants.SUBMIT_REGISTRATION_BUTTON_ID).click();
    }


    //function that fill the registration form
    protected static void fillRegistrationForm(WebDriver driver) {

        driver.findElements(Constants.FIRST_NAME_REGISTRATION_ID).get(0).sendKeys("Elad");
        driver.findElements(Constants.EMAIL_REGISTRATION_ID).get(1).sendKeys("automationexpertqa100@gmail.com");
        driver.findElements(Constants.PASS_REGISTRATION_ID).get(2).sendKeys("Test246810");
        driver.findElements(Constants.PASS_CONFIRMATION_REGISTRATION_ID).get(3).sendKeys("Test246810");


    }
    //this function will fill login mode

    public static void loginWithExistingUser(WebDriver driver) {

        driver.findElement(Constants.SIGNUP_BUTTON_ID).click(); // click SignUp or Login
        driver.findElement(Constants.EMAIL_LOGIN_ID).sendKeys("automationexpertqa100@gmail.com");
        //driver.findElements(Constants.EMAIL_LOGIN_ID).get(0).sendKeys("automationexpertqa100@gmail.com");
        //driver.findElements(Constants.PASS_LOGIN_ID).get(1).sendKeys("Test246810");
        driver.findElement(Constants.PASS_LOGIN_ID).sendKeys("Test246810");
        driver.findElement(Constants.LOGIN_BUTTON_ID).click();
    }
}



