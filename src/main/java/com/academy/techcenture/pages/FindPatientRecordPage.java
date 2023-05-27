package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;

public class FindPatientRecordPage extends BasePage{
    public FindPatientRecordPage (WebDriver driver){
        super (driver);

    }
    @FindBy(id = "patient-search")
    protected WebElement patientSearchBox;
    public void searchPatientID(){
        patientSearchBox.sendKeys(ConfigReader.getProperty("PID"));
        patientSearchBox.sendKeys(Keys.RETURN);

    }
}
