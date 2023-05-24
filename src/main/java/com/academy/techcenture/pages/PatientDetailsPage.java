package com.academy.techcenture.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


public void verifyPatientInfo(){
    Assert.assertEquals("100HWJ", patientID.getText().trim());
    Assert.assertEquals("Kevin", givenName.getText().trim());
    Assert.assertEquals("Lee1", familyName.getText().trim());
    Assert.assertEquals("Male", gender.getText().trim());
    String age1 = new String(age.getText().trim());
    Assert.assertEquals("43", age1.substring(0,2));
    Assert.assertEquals("01.Jan.1980", age1.substring(13,24));
}
public void goToHomePage(){
    homePage.click();
}
}
