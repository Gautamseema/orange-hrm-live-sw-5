package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnLogin;



    public void setClickOnLogin() {
        clickOnElement(clickOnLogin);
}

//    @CacheLookup
//    @FindBy(xpath = "//input[@placeholder='Username']")
//    WebElement UserName;
//    @CacheLookup
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement Password;
//    @CacheLookup
//    @FindBy(xpath = "//button[normalize-space()='Login']")
//    WebElement LoginButton;
//    @CacheLookup
//    @FindBy(xpath = "//h5[normalize-space()='Login']")
//    WebElement LoginText;
//
//
//    public void enterUserName(String Text) {
//        sendTextToElement(UserName, Text);
//        CustomListeners.test.log(Status.PASS, "Enter Password");
//    }
//
//    public void enterPassword(String text) {
//        sendTextToElement(Password, text);
//        CustomListeners.test.log(Status.PASS, "Enter Password");
//    }
//
//    public void clickOnLoginButton() {
//        clickOnElement(LoginButton);
//        CustomListeners.test.log(Status.PASS, "Click on login button");
//    }
//
//    public String getLoginText() {
//        String message = getTextFromElement(LoginText);
//        CustomListeners.test.log(Status.PASS, "Message is not displayed");
//        return message;
//    }
}