package com.spgTesting.TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyMethod {

    @Test(priority = 1)
    void opencard()
    {
        //Assert.assertTrue(false);  // if it fails next tests are ignored becouse of dependencies
        Assert.assertTrue(true);
    }

    @Test(priority = 2,dependsOnMethods = "opencard")
    void login()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 3,dependsOnMethods = "login")
    void search()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 4,dependsOnMethods = "login")
    void adSearch()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 5,dependsOnMethods = "login")
    void logout()
    {
        Assert.assertTrue(true);
    }


}
