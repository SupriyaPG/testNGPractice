package com.spgTesting.TestNGAnnotations;

import org.testng.annotations.*;

public class AnnotationDemo2 {

    @BeforeClass
    void login()
    {
        System.out.println("This is login.");
    }

    @Test(priority = 1)
    void search()
    {
        System.out.println("This is search.");
    }


    @Test(priority = 2)
    void advancedsSearch()
    {
        System.out.println("This is advanced search.");
    }

    @AfterClass
    void logout()
    {
        System.out.println("This is logout.");
    }
}
