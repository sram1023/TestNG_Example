package com.demo.pages;

import com.demo.base.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountCreation extends Context {

    By titleRadioBtns = By.xpath("//input[@type='radio']");
    By title = By.name("id_gender");
    By emailAddress = By.id("email_create");
    By createAccount = By.id("SubmitCreate");
//    By authenLabel = By.xpath("//h1[contains(text(),'Authentication')]");
    By customerFirstname = By.id("customer_firstname");
    By customerLastname = By.id("customer_lastname");
    By customerPassword = By.id("passwd");

//    public AccountCreation(Context context) {
//        this.context1 = context;
//    }

    public void setEmailAddress(String emailAdd){
        driver.findElement(emailAddress).sendKeys(emailAdd);
    }

    public void clickCreateAccount(){ driver.findElement(createAccount).click();
    }

    public void title(String titleTxt) {
        List<WebElement> title = driver.findElements(titleRadioBtns);
        for (int i = 0; i < title.size(); i++) {
            String titleValue= title.get(i).getAttribute("value");
            if(titleValue.replace("1",titleTxt).equals("Mr.")){
                title.get(i).click();
                break;
            }
        }
    }

    public void firstName(String firstName){
        driver.findElement(customerFirstname).sendKeys(firstName);
    }

    public void lastName(String lastName){
        driver.findElement(customerLastname).sendKeys(lastName);

    }

    public void password(String password){
        driver.findElement(customerPassword).sendKeys(password);
    }

}
