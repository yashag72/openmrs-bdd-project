package com.academy.techcenture.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super (driver);

    }
    @FindBy(xpath = "//li[@class='nav-item identifier']")
    protected WebElement loggedUsername;
    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    protected WebElement findPatientRecord;
    @FindBy(id = "org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension")
    protected WebElement activeVisits;
    @FindBy(id = "referenceapplication-vitals-referenceapplication-vitals-extension")
    protected WebElement captureVitals;
    @FindBy(id = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
    protected WebElement registerAPatient;
    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    protected WebElement appointmentScheduler;
    @FindBy(id = "reportingui-reports-homepagelink-reportingui-reports-homepagelink-extension")
    protected WebElement reports;
    @FindBy(id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    protected WebElement datamanagement;
    @FindBy(id = "org-openmrs-module-adminui-configuremetadata-homepageLink-org-openmrs-module-adminui-configuremetadata-homepageLink-extension")
    protected WebElement configureMetadata;
    @FindBy(id = "coreapps-systemadministration-homepageLink-coreapps-systemadministration-homepageLink-extension")
    protected WebElement systemAdministration;


    public void verifyTitle(){
        wait.until(ExpectedConditions.titleIs("Home"));
        Assert.assertTrue(driver.getTitle().equals("Home"));
    }

    public void verifyLoggedUsername(){
        String currentUser = loggedUsername.getText().trim();
        Assert.assertEquals("admin",currentUser);
    }
    public void verifyTopOptions(){
        Assert.assertTrue(selectedLocation.isDisplayed());
        Assert.assertEquals("Pharmacy", selectedLocation.getText().trim());
        Assert.assertTrue(logoutBtn.isDisplayed());
    }






}
