package com.task.step_definitions;

import com.task.pages.BlogPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateBlogStepDefs {

    BlogPage blogPage= new BlogPage();




    @When("the user navigates to blogs")
    public void the_user_navigates_to_blogs() {
       blogPage.clickItem();

    }
    @Then("the user should be able to go Blog page")
    public void the_user_should_be_able_to_go_Blog_page() {
        blogPage.getTitle();



    }



//    @When("the user backs to homepage")
//    public void the_user_backs_to_homepage() {
//       blogPage.clickToTitle();
//    }




}
