package com.spgTesting.TestNGAnnotations.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.time.Duration;

public class paramTest {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

    }

    @Test(priority=1)
    void testLogo()
    {
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);
    }

    @Test(priority = 2)
    void testTitle()
    {

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test(priority = 3)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
