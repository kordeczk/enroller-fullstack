package com.company.enroller.e2e.authentication;

import com.company.enroller.e2e.BasePage;
import com.company.enroller.e2e.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(css = "div > input + button")
    private WebElement loginBtn;

    @FindBy(css = "TODO")
    private WebElement logoutBtn;

    @FindBy(css = "TODO")
    private WebElement loginInput;

    @FindBy(css = "TODO")
    private WebElement loginLabel;

    @FindBy(css = "TODO")
    private WebElement welcomeLabel;

    @FindBy(xpath = "TODO")
    private WebElement addNewMeetingBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginAs(String login) {
        //TODO
    }

    public Boolean loginBtnIsPresent() {
        return this.elementIsPresent(this.loginBtn);
    }

}
