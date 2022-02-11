package com.task.step_definitions;

import com.task.pages.HomePage;
import com.task.pages.LoginPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
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
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {

        String gmail2 = ConfigurationReader.get("user_gmail");
        String password2 = ConfigurationReader.get("user_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(gmail2,password2);

    }
    @Then("the user should be able to go homepage")
    public void the_user_should_be_able_to_go_homepage() {
    }

    @Then("the title contains {string}")
    public void the_title_contains(String str) {
        Assert.assertTrue(Driver.get().getTitle().contains(str));
    }

    @When("the user clicks avatar icon")
    public void the_user_clicks_avatar_icon() {
        homePage.clickAvatar();
    }
    @When("the user clicks {string} in dropDown menu")
    public void the_user_clicks_in_dropDown_menu(String dropDownEl) {
     homePage.clickDroptDownElement();
    }

    @When("update personal and profesional data")
    public void update_personal_and_profesional_data() {
        homePage.clickEditIcon();
        String name ="Maria";
        homePage.clearExistingText(name);
        homePage.yearUpdate();
        homePage.profUpdate();
    }


}
