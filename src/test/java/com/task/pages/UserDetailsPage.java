package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class UserDetailsPage {
    public UserDetailsPage(){
            PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "fullName")
    public WebElement enterName;


    @FindBy(xpath = "//*[@class='ngx-dropdown-button' and contains(.,' years')]")
    public WebElement selectYear;

    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[2]")
    public WebElement selectprof;

    @FindBy(id = "designation")
    public WebElement designation;


    @FindBy(xpath = "//button[.='Save and Continue' and contains(@class,'btn-save')]")
    public WebElement saveAndContinue;




    public void clearExistingAndSentNewText(String newText){
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

    public void updateDesignation(String des){
        designation.clear();
        designation.sendKeys(des);

    }

    public void clickSaveButton(){
        saveAndContinue.click();
    }
}
