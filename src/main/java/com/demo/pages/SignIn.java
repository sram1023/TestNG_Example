package com.demo.pages;

import com.demo.base.Context;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SignIn extends Context {

//    Context context;
    By logIn = By.xpath("//a[contains(text(),'Sign in')]");
    By authenLabel = By.xpath("//h1[contains(text(),'Authentication')]");

//    public SignIn(Context context) {
//        this.context = context;
//    }

    public void signIn() {
        driver.findElement(logIn).click();
    }

    public void verifyLoginPage() {
        WebElement authentication = driver.findElement(authenLabel);
        Assert.assertTrue(authentication.isDisplayed());
        Context.log.info("Authentication Label is displayed");
    }
}
