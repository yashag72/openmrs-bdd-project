package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PatientDetailsStepDefs {

        private LogInPage logInPage;
        private HomePage homePage;
        private RegistrationPage registrationPage;
        private PatientDetailsPage patientDetailsPage;
        private WebDriver driver = Driver.getDriver();
        @Given("user is already logged in")
        public void user_is_already_logged_in() throws InterruptedException {
            logInPage = new LogInPage(driver);
            driver.get(ConfigReader.getProperty("url"));
            Thread.sleep(2000);
            logInPage.enterUserName("Admin");
            logInPage.enterPassword("Admin123");
            logInPage.selectPharmacy();
            logInPage.loginBtnClick();
        }

   @When("user is on patient detail page1")
    public void user_is_on_patient_detail_page1() {
       patientDetailsPage = new PatientDetailsPage(driver);
       patientDetailsPage.verifyTitle();
   }
    @When("user verifies top section")
    public void user_verifies_top_section() {
            patientDetailsPage.verifyPatientInfo();
    }

 //   @When("user create a sticky note message")
 //   public void user_create_a_sticky_note_message() {
 //    patientDetailsPage.enterNote();
//    }
//    @When("user verifies all of the visible components")
//    public void user_verifies_all_of_the_visible_components() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user goes back to home page")
//    public void user_goes_back_to_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
