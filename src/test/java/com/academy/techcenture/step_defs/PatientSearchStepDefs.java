package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.HomePage;
import com.academy.techcenture.pages.LogInPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class PatientSearchStepDefs {
    private LogInPage logInPage;
    private HomePage homePage;
    private WebDriver driver = Driver.getDriver();
    @Given("user is already logged in")
    public void user_is_already_logged_in() throws InterruptedException {
        logInPage = new LogInPage(driver);
        Thread.sleep(3000);
        driver.get(ConfigReader.getProperty("url"));
        logInPage.enterUserName("Admin");
        logInPage.enterPassword("Admin123");
        logInPage.selectPharmacy();
        logInPage.loginBtnClick();

    }
//    @When("user is on home page")
//    public void user_is_on_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("user clicks on Find Patient Record tab")
//    public void user_clicks_on_find_patient_record_tab() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("user searches patient by its ID")
//    public void user_searches_patient_by_its_id() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("user verifies found information")
//    public void user_verifies_found_information() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user goes back to home page")
//    public void user_goes_back_to_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
