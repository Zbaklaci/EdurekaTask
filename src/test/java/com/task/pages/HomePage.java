package com.task.pages;

import com.task.utilities.BrowserUtils;
import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//img[@class='img30']")
    public WebElement avatar;

    @FindBy(xpath = "//*[.='My Profile']")
    public WebElement myProfile;



//css = "(//button[@class='ngx-dropdown-button'])[5]"
    public void clickAvatar() {
        avatar.click();
    }
    public void clickDroptDownElement() {
        myProfile.click();
    }






}
