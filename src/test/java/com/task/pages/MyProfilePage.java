package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public MyProfilePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "(//*[.='Blog']")
    public WebElement blog;

    @FindBy(className = "icon-pr-edit")
    public WebElement editIcon;
//    (//div[@class='ngx-dropdown-container'])[1]

    public void clickEditIcon() {
        editIcon.click();
    }

    public void clickBlogItem(){
        blog.click();
    }


}
