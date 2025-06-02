package com.spgTesting.TestNGAnnotations.Grouping;

import org.testng.annotations.Test;

public class signUpTests {

    @Test(priority = 1,groups = {"Regression"})
    void signByEmail()
    {
        System.out.println("sign by email.");
    }

    @Test(priority = 2,groups = {"Regression"})
    void signByFacebook()
    {
        System.out.println("sign by facebook.");
    }

    @Test(priority = 3,groups = {"Regression"})
    void signBytwitter()
    {
        System.out.println("sign by twitter.");
    }
}
