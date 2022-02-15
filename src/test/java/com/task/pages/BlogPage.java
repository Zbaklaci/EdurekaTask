package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage extends BasePage {

    public BlogPage() {
        PageFactory.initElements(Driver.get(), this);
    }

   @FindBy(linkText = "Home")
    public WebElement home;

    public void clickHome(){
        home.click();
}





}