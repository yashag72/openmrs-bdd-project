package com.academy.techcenture.pages;

import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BasePage{
    public LogInPage (WebDriver driver){
        super (driver);

    }

    public void verifyTitle(){
        wait.until(ExpectedConditions.titleIs("Login"));
        Assert.assertTrue(driver.getTitle().equals("Login"));
    }


    public void user_is_on_login_page() {

    }

    public void user_clicks_on_sign_in_link() {

    }

    public void user_enters_a_valid_username(String string) {

    }

    public void user_enters_a_valid_password(String string) {

    }

    public void user_selects_location() {

    }

    public void user_clicks_on_the_log_in_button() {

    }

    public void user_should_be_logged_in_successfully() {

    }







}
