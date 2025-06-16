package com.spgTesting.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    //Constructor
    loginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //Locator
    By txt_username_loc=By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");


    //Action Method
    public void setUserName(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPasswordName(String pwd)
    {
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    public void clickLogin()
    {
        driver.findElement(btn_login_loc).click();
    }
}
