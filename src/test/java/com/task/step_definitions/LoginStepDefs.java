package com.task.step_definitions;

import com.task.pages.HomePage;
import com.task.pages.LoginPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginStepDefs {

    HomePage homePage = new HomePage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {

        String gmail2 = ConfigurationReader.get("user_gmail");
        String password2 = ConfigurationReader.get("user_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(gmail2, password2);

    }

    @Then(" the user should be able to see the title contains {string}")
    public void the_title_contains(String str) {
        Assert.assertTrue(Driver.get().getTitle().contains(str));
    }

    @When("the user clicks avatar icon")
    public void the_user_clicks_avatar_icon() {
        homePage.clickAvatar();
    }

    @When("the user clicks My Profile in dropDown menu")
    public void the_user_clicks_in_My_Profile_dropDown_menu() {
        homePage.clickDroptDownElement();
    }


    @And("the user clicks log out in dropDown menu")
    public void theUserClicksLogOutInDropDownMenu() {
        homePage.clickLogOut();

    }


    @And("log out portal")
    public void logOutPortal() {
        Driver.get().getTitle();
    }
}
