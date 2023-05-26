package com.academy.techcenture.pages;

import com.academy.techcenture.config.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "//input[@name='givenName']")
    protected WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='familyName']")
    protected WebElement lastNameInput;

    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    protected WebElement patientID;
    @FindBy(id = "gender-field")
    protected WebElement genderField;
    @FindBy(id = "birthdateDay-field")
    protected WebElement birthDay;
    @FindBy(id = "birthdateYear-field")
    protected WebElement birthYear;
    @FindBy(id = "birthdateMonth-field")
    protected WebElement birthMonthDrop;
    @FindBy(id = "address1")
    protected WebElement st_address;
    @FindBy(id = "cityVillage")
    protected WebElement cityName;
    @FindBy(id = "stateProvince")
    protected WebElement stateName;
    @FindBy(id = "country")
    protected WebElement countryName;
    @FindBy(id = "postalCode")
    protected WebElement zip;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    protected WebElement phoneNumber;
    @FindBy(id = "relationship_type")
    protected WebElement relationship_selection;
    @FindBy(xpath = "//input[@placeholder='Person Name']")
    protected WebElement rel_name;
    @FindBy(xpath = "(//div[@id='dataCanvas']/div/p/span)[@class='title'][2]")
    protected WebElement verifyGender;
    @FindBy(xpath = "(//div[@id='dataCanvas']/div/p/span)[@class='title'][1]")
    protected WebElement verifyName;
    @FindBy(id = "submit")
    protected WebElement confirmBtn;

public void enterFirstName(String firstName) {
    firstNameInput.sendKeys(firstName);
}
    public void enterLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }
    public void selectTheGender(String gender) {
        genderField.click();
        WebElement genderSelect = driver.findElement(By.id("gender-field"));
        Select select = new Select(genderSelect);
        List<WebElement> text = driver.findElements(By.xpath("//select[@name='gender']/option"));
        select.selectByVisibleText(gender);
}
    public void fillOutBirthday_Day(String day){
    birthDay.sendKeys(day);
    }
    public void selectMonth(String month){
    birthMonthDrop.click();
    WebElement monthSelect = driver.findElement(By.id("birthdateMonth-field"));
    Select select = new Select(monthSelect);
    List<WebElement> text = driver.findElements(By.xpath("//select[@id='birthdateMonth-field']/option"));
    select.selectByVisibleText(month);
    }
    public void fillOutYear(String year){
    birthYear.sendKeys(year);
    }
    public void fillOutAddress(String street_address, String city, String state, String country, String postal_code){
    st_address.sendKeys(street_address);
    cityName.sendKeys(city);
    stateName.sendKeys(state);
    countryName.sendKeys(country);
    zip.sendKeys(postal_code);
    }
    public void enterPhoneNumber(String phone){
    phoneNumber.sendKeys(phone);
    }
    public void selectRelationship(String relationship_type, String relative_name){
    Select select = new Select(relationship_selection);
    List<WebElement> text = driver.findElements(By.xpath("//select[@id='relationship_type']/option"));
    select.selectByVisibleText(relationship_type);
    rel_name.sendKeys(relative_name);
    }
    public void userVerifyInfo(){
        Assert.assertTrue(verifyGender.isDisplayed());
        Assert.assertTrue(verifyName.isDisplayed());
        Assert.assertTrue(confirmBtn.isEnabled());
    }
    public void clickConfirmBtn(){
    confirmBtn.click();
    }


public void savePatientID(){
    String ID = patientID.getText().trim();
    ConfigReader.setProperty("PID", ID);
}

}
