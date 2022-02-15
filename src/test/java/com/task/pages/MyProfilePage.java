package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public MyProfilePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(className = "icon-pr-edit")
    public WebElement editIcon;


    public void clickEditIcon() {
        editIcon.click();
    }


}
