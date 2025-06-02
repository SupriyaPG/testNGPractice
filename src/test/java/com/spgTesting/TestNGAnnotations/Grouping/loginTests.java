package com.spgTesting.TestNGAnnotations.Grouping;

import org.testng.annotations.Test;

public class loginTests {

    @Test(priority = 1,groups = {"Sanity"})
    void loginByEmail()
    {
        System.out.println("Login by email.");
    }

    @Test(priority = 2,groups = {"Sanity"})
    void loginByFacebook()
    {
        System.out.println("Login by facebook.");
    }

    @Test(priority = 3,groups = {"Sanity"})
    void loginBytwitter()
    {
        System.out.println("Login by twitter.");
    }
}
