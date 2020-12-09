package com.elad.pages;

import org.openqa.selenium.By;

public class Constants {
    ///Home Screen
    public static final By SIGNUP_BUTTON_ID = By.className("seperator-link");
    //drop menu

    public static final By DROP_MENU_ID = By.className("chosen-single");
    public static final By DROP_MENU_SEARCH_ID = By.xpath("/html/body/div[1]/div/header/div[3]/div/form/a");


    //Registration screen
    public static final By REGISTRATION_BUTTON_ID = By.className("text-btn");
    public static final By SUBMIT_REGISTRATION_BUTTON_ID = By.className("ui-btn");
    public static final By FIRST_NAME_REGISTRATION_ID = By.className("ember-text-field");
    public static final By EMAIL_REGISTRATION_ID = By.className("ember-text-field");
    public static final By PASS_REGISTRATION_ID = By.className("ember-text-field");
    public static final By PASS_CONFIRMATION_REGISTRATION_ID = By.className("ember-text-field");

    // Login screen
    public static final By EMAIL_LOGIN_ID = By.id("ember1223");
    public static final By PASS_LOGIN_ID = By.id("ember1225");
    public static final By LOGIN_BUTTON_ID = By.xpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div/div[3]/form/button");


    //Choose a gift screen
    public static final By RESTRANT_ID = By.className("thumbnail");
    public static final By PRICE_ID = By.className("input-cash");
    public static final By SUBMIT_PRICE_ID = By.className("btn-theme");

    //Sender Receiver Info Screen
    public static final By RECEIVER_NAME_ID = By.className("ember-text-field");
    public static final By SENDER_NAME_ID = By.className("ember-text-field");
    public static final By BLESSING_ID = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[2]/textarea");
    public static final By FILE_UPLOAD_ID = By.name("fileUpload");
    public static final By EMAIL_RECEIVES_ID = By.className("btn-send-option");
    public static final By EMAIL_RECEIVES_FILL_ID = By.className("input-theme");
    public static final By SAVE_ID = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[4]/div/div[4]/div/div[2]/button[2]");
    public static final By EVENT_DROP_MENU_ID = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[1]/div/a");


}
