/*
package com.elad.pages;
import freemarker.template.utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SenderReceiverInfo {

    //this function will fill the sender receiver form
    protected static void senderReceiverForm(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[1]/label[1]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[1]/div/div/ul/li[3]"))).click();
        driver.findElement(By.className("send-now")).click();
    }

    // this function will upload the picture
    protected static void pictureUpload(WebDriver driver) {
        driver.findElement(Constants.FILE_UPLOAD_ID).sendKeys("/Users/eladyerushalmi/BuyMe-website/images");

    }

    //this function will choose email option and fill it
    protected static void emailSelection(WebDriver driver) {
        driver.findElements(Constants.EMAIL_RECEIVES_ID).get(0).click();
        driver.findElement(Constants.EMAIL_RECEIVES_FILL_ID).sendKeys("");
        driver.findElement(Constants.SAVE_ID).click();


    }


}


*/
