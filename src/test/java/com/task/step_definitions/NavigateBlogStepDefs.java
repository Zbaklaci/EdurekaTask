package com.task.step_definitions;

import com.task.pages.BlogPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class NavigateBlogStepDefs {

    BlogPage blogPage= new BlogPage();

    @Then("the user explores to blogs")
    public void the_user_explores_to_blogs() {

        List<WebElement> buttons = Driver.get().findElements(By.cssSelector("h3[class='category-name']"));

        System.out.println("buttons.size() = " + buttons.size());
        for (WebElement button : buttons) {
            System.out.println("button.name = " + button.getText());

        }

        buttons.get(1).click();
    }



    @Then("the user should be able to go Blog page")
    public void the_user_should_be_able_to_go_Blog_page() {
        String currentWindowHandle = Driver.get().getWindowHandle();

        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                Driver.get().switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window:"+Driver.get().getTitle());

    }


    @And("the user should be able to back homepage")
    public void theUserShouldBeAbleToBackHomepage() {

        blogPage.clickHome();



    }

}






