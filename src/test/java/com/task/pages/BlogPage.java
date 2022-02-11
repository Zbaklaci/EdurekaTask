package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage extends BasePage{

    public BlogPage(){
        PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "(//*[@target='_blank'])[2]")
    public WebElement Blog;

    @FindBy(xpath = "//*[@class='category-box']")
    public WebElement blogsItem;


    @FindBy(xpath = "(//*[@class='text-truncate'])[1]")
    public WebElement title;

    public void clickBlog(){
        Blog.click();
    }

    public void clickItem(){
        blogsItem.click();
    }

    public void clickToTitle(){
     title.click();
    }
  }

