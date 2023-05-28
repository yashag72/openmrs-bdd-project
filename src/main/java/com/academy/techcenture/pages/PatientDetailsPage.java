package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PatientDetailsPage extends BasePage{
    public PatientDetailsPage(WebDriver driver){
        super (driver);
    }


    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    protected WebElement patientID;
    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    protected WebElement givenName;
    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    protected WebElement familyName;
    @FindBy(xpath = "(//div[@class='gender-age col-auto']/span)[1]")
    protected WebElement gender;
    @FindBy(xpath = "(//div[@class='gender-age col-auto']/span)[2]")
    protected WebElement age;
    @FindBy (className = "icon-sticky-note")
    protected WebElement stickyNoteBtn;
    @FindBy(xpath = "//textarea")
    protected WebElement textarea;

    @FindBy (xpath = "//button[@type='submit']")
    protected WebElement checkMark;
    @FindBy(xpath = "//ul[@id='breadcrumbs']/li/a")
    protected WebElement homePage;
    @FindBy(xpath = "//span[@id='TextField']/pre[1]")
    protected WebElement ourStickyNote;
    @FindBy(id = "coreapps-diagnosesList")
    protected WebElement diagnosis;
    @FindBy(xpath = "(//div[@class='info-header'])[2]")
    protected WebElement observations;

    @FindBy(xpath = "(//div[@class='info-header'])[3]")
    protected WebElement health;
    @FindBy(xpath = "(//div[@class='info-header'])[8]")
    protected WebElement family;




    public void verifyTitle (){
        wait.until(ExpectedConditions.titleIs("OpenMRS Electronic Medical Record"));
        Assert.assertTrue(driver.getTitle().equals("OpenMRS Electronic Medical Record"));
    }

public void verifyPatientInfo() {
    Assert.assertEquals(ConfigReader.getProperty("PID"), patientID.getText().trim());
    Assert.assertEquals(ConfigReader.getProperty("fName"), givenName.getText().trim());
    Assert.assertEquals(ConfigReader.getProperty("lName"), familyName.getText().trim());
    Assert.assertEquals(ConfigReader.getProperty("gender"), gender.getText().trim());
    String age1 = new String(age.getText().trim());
    //Assert.assertEquals(, age1.substring(0, 2));
    //Assert.assertEquals("20.Dec.1980", age1.substring(13, 24));
}

    public void enterNote () throws InterruptedException {
        stickyNoteBtn.click();
        textarea.sendKeys("First Visit");
        Thread.sleep(1000);
        checkMark.click();
        System.out.println(ourStickyNote.getText().trim());

    }
    public void userVerifyVisibleComponents(){
        Assert.assertTrue(diagnosis.isDisplayed());
        Assert.assertTrue(observations.isDisplayed());
        Assert.assertTrue(health.isDisplayed());
        Assert.assertTrue(family.isDisplayed());
    }
    public void goToHomePage() throws InterruptedException {
        homePage.click();

    }



}

