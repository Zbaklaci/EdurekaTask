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

    @FindBy(className = "img30")
    public WebElement avatar;

    @FindBy(xpath = "//*[.='My Profile']")
    public WebElement myProfile;

    @FindBy(className = "icon-pr-edit")
    public WebElement editIcon;
//    (//div[@class='ngx-dropdown-container'])[1]

    @FindBy(id = "fullName")
    public WebElement enterName;


    @FindBy(xpath = "//span[@class='nsdicon-angle-down']")
    public WebElement selectYear;

    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[2]")
    public WebElement selectprof;

//css = "(//button[@class='ngx-dropdown-button'])[5]"
    public void clickAvatar() {
//        BrowserUtils.waitFor(1);
        avatar.click();
    }
    public void clickDroptDownElement() {
        myProfile.click();
    }

    public void clickEditIcon() {
        editIcon.click();
    }
    public void clearExistingText(String newText){
        enterName.clear();
        enterName.sendKeys(newText);
    }
    public void yearUpdate(){
        selectYear.click();
        Driver.get().findElement(By.xpath("(//ul[@class='available-items']/li)[1]")).click();

    }
    public void profUpdate(){
        selectprof.click();
        Driver.get().findElement(By.xpath("(//ul[@class='available-items']/li)[5]")).click();
    }



}
