package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

 public LoginPage(){
     PageFactory.initElements(Driver.get(), this);
 }
@FindBy(id = "si_popup_email")
public WebElement emailBox;

 @FindBy(id = "si_popup_passwd")
 public WebElement passwordBox;

 @FindBy(xpath = "//*[.='Login']")
 public WebElement loginButton;


    public void login(String gmail1, String password1) {
        emailBox.sendKeys(gmail1);
        passwordBox.sendKeys(password1);
        loginButton.click();

    }
}
