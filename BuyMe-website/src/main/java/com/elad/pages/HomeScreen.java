package com.elad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomeScreen {
    // this function will drop the "Drop menu"
    public static void Drop_Menu_Choosing(WebDriver driver) {
        Drop_menu_fill(driver);
        driver.findElement(Constants.DROP_MENU_SEARCH_ID).click();


    }

    //this function will fill the "Drop menu"
    protected static void Drop_menu_fill(WebDriver driver) {
        List<WebElement> dropDownList = driver.findElements(Constants.DROP_MENU_ID);
        WebElement price = dropDownList.get(0);
        WebElement area = dropDownList.get(1);
        WebElement category = dropDownList.get(2);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        price.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/header/div[3]/div/form/div[1]/div/ul/li[3]"))).click();

        area.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/header/div[3]/div/form/div[2]/div/ul/li[2]"))).click();

        category.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/header/div[3]/div/form/div[3]/div/ul/li[6]"))).click();

    }


}
