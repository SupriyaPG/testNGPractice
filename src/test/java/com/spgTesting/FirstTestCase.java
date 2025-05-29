package com.spgTesting;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    public void openApp()
    {
        System.out.println("Opening Application.");
    }

    @Test(priority = 2)
    public  void Login()
    {
        System.out.println("Login process.");
    }

    @Test(priority = 3)
    public void logout()
    {
        System.out.println("Application logout.");
    }
}
