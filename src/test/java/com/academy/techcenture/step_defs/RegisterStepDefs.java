package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefs {
    private LogInPage logInPage;
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private PatientDetailsPage patientDetailsPage;
    private FindPatientRecordPage findPatientRecordPage;
    private WebDriver driver = Driver.getDriver();
    @Given("user is already logged")
    public void user_is_logged() throws InterruptedException {
        logInPage = new LogInPage(driver);
        driver.get(ConfigReader.getProperty("url"));
        Thread.sleep(1000);
        logInPage.enterUserName("Admin");
        logInPage.enterPassword("Admin123");
        logInPage.selectPharmacy();
        logInPage.loginBtnClick();
    }
    @When("user is on register a patient page")
    public void user_is_on_register_a_patient_page() {
        homePage = new HomePage(driver);
        homePage.registerPatientTabClick();

    }
    @When("user enters all of the required info")
    public void user_enters_all_of_the_required_info() {
       registrationPage = new RegistrationPage(driver);
       registrationPage.patientName();
    }
//    @When("user verifies all of the information")
//    public void user_verifies_all_of_the_information() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user clicks confirm button")
//    public void user_clicks_confirm_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
