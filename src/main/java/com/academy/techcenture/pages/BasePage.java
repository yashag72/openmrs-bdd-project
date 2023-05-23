package com.academy.techcenture.pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;


    protected WebDriverWait wait;

    @FindBy(id = "session-location")
    protected WebElement locationOption;

    @FindBy(id = "selected-location")
    protected WebElement selectedLocation;
    //li[@class='nav-item logout']/a
    @FindBy(xpath = "//li[@class='nav-item logout']/a")
    protected WebElement logoutBtn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
    }







}
