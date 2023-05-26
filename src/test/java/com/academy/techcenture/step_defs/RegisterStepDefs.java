package com.academy.techcenture.step_defs;

import com.academy.techcenture.config.ConfigReader;
import com.academy.techcenture.driver.Driver;
import com.academy.techcenture.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.events.Event;

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
    @When("user enters {string} in the firstname input")
    public void user_enters_in_the_firstname_input(String firstName) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstName(firstName);
    }
    @When("user enters {string} in the lastname input")
    public void user_enters_in_the_lastname_input(String lastName) {
        registrationPage.enterLastName(lastName);
        registrationPage.clickNextBtn();
    }
    @When("user selects {string}")
    public void user_selects(String gender) {
    registrationPage.selectTheGender(gender);
    registrationPage.clickNextBtn();
    }
    @When("user enters {string} in the day input")
    public void user_enters_in_the_day_input(String day) {
        registrationPage.fillOutBirthday_Day(day);
    }
    @When("user selects {string} from the month list")
    public void user_selects_from_the_month_list(String month) {
        registrationPage.selectMonth(month);
    }
    @When("user enters {string} in the year input")
    public void user_enters_in_the_year_input(String year) {
     registrationPage.fillOutYear(year);
     registrationPage.clickNextBtn();
    }
    @When("user enters {string} and {string} and {string} and {string} and {string}")
    public void user_enters_and_and_and_and(String street_address, String city, String state, String country, String postal_code) {
        registrationPage.fillOutAddress(street_address, city, state, country, postal_code);
        registrationPage.clickNextBtn();

    }
    @When("user enters {string} number")
    public void user_enters_number(String phone) {
registrationPage.enterPhoneNumber(phone);
registrationPage.clickNextBtn();
    }
    @When("user enters {string} and {string} on this page")
    public void user_enters_and_on_this_page(String relationship_type, String relative_name) {
        registrationPage.selectRelationship(relationship_type, relative_name);
        registrationPage.clickNextBtn();

    }

    @When("user verifies all of the information")
    public void user_verifies_all_of_the_information() {
    registrationPage.userVerifyInfo();
    }
    @Then("user clicks confirm button")
    public void user_clicks_confirm_button() {
      registrationPage.clickConfirmBtn();
      registrationPage.savePatientID();
      registrationPage.logou();

    }
}
