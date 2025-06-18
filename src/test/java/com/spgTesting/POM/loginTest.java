package com.spgTesting.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


//Without using page Factory


public class loginTest {

    WebDriver driver;

    @BeforeClass
    void setUp()
    {
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin()
    {
       // loginPage lp=new loginPage(driver);
        loginPage_usingPageFactory lp=new loginPage_usingPageFactory(driver);
        lp.setUserName("Admin");
        lp.setPasswordName("admin123");
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
