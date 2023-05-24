package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.FindPatientRecordPage;
import com.academy.techcenture.pages.HomePage;
import com.academy.techcenture.pages.LogInPage;
import com.academy.techcenture.pages.PatientDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PatientSearchStepDefs {
    private LogInPage logInPage;
    private HomePage homePage;
    private FindPatientRecordPage findPatientRecordPage;
    private PatientDetailsPage patientDetalsPage;
    private WebDriver driver = Driver.getDriver();
    @Given("user is logged in")
    public void user_is_logged_in() throws InterruptedException {
        logInPage = new LogInPage(driver);
        driver.get(ConfigReader.getProperty("url"));
        Thread.sleep(4000);
        logInPage.enterUserName("Admin");
        logInPage.enterPassword("Admin123");
        logInPage.selectPharmacy();
        logInPage.loginBtnClick();

    }
    @When("user is on home page")
    public void user_is_on_home_page() {
        homePage = new HomePage(driver);
       homePage.verifyTitle();
    }
    @When("user clicks on Find Patient Record tab")
    public void user_clicks_on_find_patient_record_tab() {
        homePage.findPatientRecordClick();
    }
    @When("user searches patient by its ID")
    public void user_searches_patient_by_its_id() {
        findPatientRecordPage = new FindPatientRecordPage(driver);
        findPatientRecordPage.searchPatientID();

    }
    @When("user verifies found information")
    public void user_verifies_found_information() {
    patientDetalsPage = new PatientDetailsPage(driver);
    patientDetalsPage.verifyPatientInfo();


    }
    @Then("user goes back to home page")
    public void user_goes_back_to_home_page() throws InterruptedException {
        patientDetalsPage = new PatientDetailsPage(driver);
        patientDetalsPage.goToHomePage();
    }
}
