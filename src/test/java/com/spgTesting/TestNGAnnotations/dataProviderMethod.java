package com.spgTesting.TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class dataProviderMethod {

    WebDriver driver;

    @BeforeClass
    void login()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(dataProvider = "dp")
    void testLogin(String email,String pwwd)throws InterruptedException
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(1000);
        boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

        if(status==true)
        {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        }
        else { Assert.fail();}
    }


    @DataProvider(name = "dp")
    Object[][] loginData()
    {
        Object data[][]={
                {"nisha@gmail.com","asd123"},
                {"xyz@gmail.com","test012"},
                {"john@gmail.com","test@123"},
                {"pavanol123@gmail.com","test123"},
                {"johncanedy@gmail.com","test"}
        };
        return data;

    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
