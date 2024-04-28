package com.corentrols.pages;

import com.corentrols.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "login")
    public WebElement emailInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongCredentialsMsg;
}
