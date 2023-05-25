package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//input[@name='givenName']")
    protected WebElement firstName;
    @FindBy(xpath = "//input[@name='familyName']")
    protected WebElement lastName;
    @FindBy(id = "next-button")
    protected WebElement nextBtn;
    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    protected WebElement patientID;
public void patientName(){
    firstName.sendKeys("Kevin");
    lastName.sendKeys("Lee");
    nextBtn.click();

}
public void savePatientID(){
    String ID = patientID.getText().trim();
    ConfigReader.setProperty("ID", ID);
}

}
