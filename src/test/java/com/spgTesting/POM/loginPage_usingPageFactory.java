package com.spgTesting.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_usingPageFactory {

    WebDriver driver;

    //Constructor
    loginPage_usingPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);  // 1st change
    }

    //Locator
//    By txt_username_loc=By.xpath("//input[@placeholder='Username']");
//    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
//    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");

    // 2nd change

    @FindBy(xpath ="//input[@placeholder='Username']") WebElement txt_username;
    @FindBy(xpath ="//input[@placeholder='Password']") WebElement txt_password;
    @FindBy(xpath ="//button[normalize-space()='Login']") WebElement btn_login;


    //Action Method
    public void setUserName(String user)
    {
        //driver.findElement(txt_username_loc).sendKeys(user);
        txt_username.sendKeys(user);  // 3rd chande
    }

    public void setPasswordName(String pwd)
    {
        //driver.findElement(txt_password_loc).sendKeys(pwd);
        txt_password.sendKeys(pwd);
    }

    public void clickLogin()
    {
      //  driver.findElement(btn_login_loc).click();
        btn_login.click();
    }
}
