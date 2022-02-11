package com.task.step_definitions;

import com.task.pages.BlogPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateStepDefs {

    BlogPage blogPage= new BlogPage();

    @When("the user clicks {string}")
    public void the_user_clicks(String item1) {
        blogPage.clickBlog();

    }
    @When("the user navigates to blogs")
    public void the_user_navigates_to_blogs() {
       blogPage.clickItem();

    }

    @When("the user backs to homepage")
    public void the_user_backs_to_homepage() {
       blogPage.clickToTitle();
    }




}
