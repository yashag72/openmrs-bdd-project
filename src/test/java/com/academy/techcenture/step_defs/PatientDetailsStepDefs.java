package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PatientDetailsStepDefs {

        private LogInPage logInPage;
        private HomePage homePage;
        private RegistrationPage registrationPage;
        private PatientDetailsPage patientDetailsPage;
        private FindPatientRecordPage findPatientRecordPage;
        private WebDriver driver = Driver.getDriver();
    @Given("user loggen on")
    public void userLoggenOn() throws InterruptedException {
            logInPage = new LogInPage(driver);
            //Thread.sleep(3000);
            driver.get(ConfigReader.getProperty("url"));
            Thread.sleep(3000);
            logInPage.enterUserName("Admin");
            logInPage.enterPassword("Admin123");
            logInPage.selectPharmacy();
            logInPage.loginBtnClick();
        }

   @When("user is on patient detail page")
    public void user_is_on_patient_detail_page() {
       homePage = new HomePage(driver);
       homePage.findPatientRecordClick();
       findPatientRecordPage = new FindPatientRecordPage(driver);
       findPatientRecordPage.searchPatientID();
    }
    @When("user verifies top section")
    public void user_verifies_top_section() {
        patientDetailsPage = new PatientDetailsPage(driver);
        patientDetailsPage.verifyTitle();
        patientDetailsPage.verifyPatientInfo();

    }




       @When("user create a sticky note message")
        public void user_create_a_sticky_note_message() throws InterruptedException {
         patientDetailsPage = new PatientDetailsPage(driver);
         patientDetailsPage.enterNote();

        }


    @When("user verifies all of the visible components")
    public void user_verifies_all_of_the_visible_components() {
       patientDetailsPage.userVerifyVisibleComponents();
    }

    @Then("back to home page")
    public void back_to_home_page() throws InterruptedException {
        patientDetailsPage.goToHomePage();
    }
}
