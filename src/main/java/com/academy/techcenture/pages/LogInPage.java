package com.academy.techcenture.pages;

import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BasePage{
    public LogInPage (WebDriver driver){
        super (driver);

    }

    @FindBy(id = "username")
    protected WebElement usernameInput;
    @FindBy(id = "password")
    protected WebElement passwordInput;
    @FindBy(id = "Inpatient Ward")
    protected WebElement inpatientWardLocation;
    @FindBy(id = "Outpatient Clinic")
    protected WebElement outpationClinicLocation;
    @FindBy(id = "Isolation Ward")
    protected WebElement isolationWardLocation;
    @FindBy(id = "Pharmacy")
    protected WebElement pharmacyLocation;
    @FindBy(id = "Laboratory")
    protected WebElement laboratoryLocation;
    @FindBy(id = "Registration Desk")
    protected WebElement registrationDeskLocation;
    @FindBy(id = "loginButton")
    protected WebElement loginButton;

    @FindBy(id = "cantLogin")
    protected WebElement cantLoginMsg;

    public void verifyTitle(){
        wait.until(ExpectedConditions.titleIs("Login"));
        Assert.assertTrue(driver.getTitle().equals("Login"));
    }
    public void verifyAllWebElements(){
        Assert.assertTrue(inpatientWardLocation.isEnabled());
        Assert.assertTrue(outpationClinicLocation.isEnabled());
        Assert.assertTrue(isolationWardLocation.isEnabled());
        Assert.assertTrue(pharmacyLocation.isEnabled());
        Assert.assertTrue(laboratoryLocation.isEnabled());
        Assert.assertTrue(registrationDeskLocation.isEnabled());
        Assert.assertTrue(loginButton.isEnabled());
        Assert.assertTrue(cantLoginMsg.isDisplayed());
    }
    public void enterUserName(String username){
        usernameInput.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void selectPharmacy(){
        pharmacyLocation.click();
    }
    public void loginBtnClick(){
        loginButton.click();
    }









}
