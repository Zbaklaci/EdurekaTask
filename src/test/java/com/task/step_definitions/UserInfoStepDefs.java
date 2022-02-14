package com.task.step_definitions;

import com.task.pages.MyProfilePage;
import com.task.pages.UserDetailsPage;
import com.task.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class UserInfoStepDefs {


    UserDetailsPage userDetailsPage= new UserDetailsPage();
    MyProfilePage myProfilePage =new MyProfilePage();



    @When("update personal and profesional data")
    public void update_personal_and_profesional_data() {
        myProfilePage.clickEditIcon();
        String name ="Kate";
        userDetailsPage.clearExistingAndSentNewText(name);
        userDetailsPage.yearUpdate();
        userDetailsPage.profUpdate();
        String profession = "SDET";
        userDetailsPage.updateDesignation(profession);
    }
    @When("the user clicks Save and Continue")
    public void the_user_clicks_Save_and_Continue() {
        userDetailsPage.clickSaveButton();
    }


    @Then("verify that name is updated to {string}")
    public void verify_that_name_is_updated_to(String actualName) {
        String expectedName = Driver.get().findElement(By.xpath("//h2[@class='user-name' and contains(.,' .')]")).getText();
        Assert.assertTrue(expectedName.contains(actualName));
    }


    @Then("verify that experience is updated to year")
    public void verify_that_experience_is_updated_to_year() {

       Assert.assertTrue(Driver.get().findElement(By.xpath("//*[@class='user-experience' and contains(.,' years')]")).isEnabled());
    }


    @Then("verify that Designation is updated to {string}")
    public void verify_that_Designation_is_updated_to(String prf) {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//*[@class='user-designation']")).isDisplayed());

    }

    @When("the user clicks Blog")
    public void theUserClicksBlog() {
        Driver.get().switchTo().frame("_hjRemoteVarsFrame");
        Driver.get().findElement(By.xpath("a[.='Blog' and contains(@target,'_')]")).click();
       Driver.get().switchTo().defaultContent();


    }
}
