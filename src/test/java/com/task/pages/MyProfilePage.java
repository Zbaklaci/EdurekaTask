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
      @FindBy(xpath = "(//*[@target='_blank'])[1]")
      public WebElement blog;

    @FindBy(className = "icon-pr-edit")
    public WebElement editIcon;
//    (//div[@class='ngx-dropdown-container'])[1]

    public void clickEditIcon() {
        editIcon.click();
    }

    public void clickBlogItem(){
//        Driver.get().switchTo().frame(0);
//        Driver.get().findElement(By.xpath("//*[.='Blog']")).click();
//        Driver.get().switchTo().defaultContent();
       blog.click();
    }


}
