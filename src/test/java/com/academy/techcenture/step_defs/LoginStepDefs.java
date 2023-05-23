package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.HomePage;
import com.academy.techcenture.pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {
    private LogInPage logInPage;
    private HomePage homePage;
    private WebDriver driver = Driver.getDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        logInPage = new LogInPage(driver);
        Thread.sleep(3000);
        driver.get(ConfigReader.getProperty("url"));
        Thread.sleep(3000);
        logInPage.verifyTitle();
    }


    @When("user familiarise with all of the items on the login webpage")
    public void user_familiarise_with_all_of_the_items_on_the_login_webpage () {
        logInPage.verifyAllWebElements();
    }

    @And("user enters a valid username {string}")
    public void user_enters_a_valid_username(String username) {
        logInPage.enterUserName(username);
    }
    @And("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
        logInPage.enterPassword(password);
    }
    @And("user selects location")
    public void user_selects_location() {
        logInPage.selectPharmacy();
    }
    @And("user clicks on the log in button")
    public void user_clicks_on_the_log_in_button() {
        logInPage.loginBtnClick();
    }
    @And("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        homePage = new HomePage(driver);
        homePage.verifyTitle();
        homePage.verifyLoggedUsername();
        homePage.verifyTopOptions();
    }
    @Then("user should verify all of the items on home page")
    public void user_should_verify_all_of_the_items_on_home_page(){
        homePage.verifyFunctionalities();
        homePage.registerPatientTabClick();
    }
}
