package com.spgTesting.TestNGAnnotations.beforeSuiteAndAfterSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test3 {

    @Test
    void pqr()
    {
        System.out.println("This is pqr method.");
    }

    @BeforeSuite
    void bs()
    {
        System.out.println("This is Befoe suite method.");
    }

    @AfterSuite
    void as()
    {
        System.out.println("This is After suit method.");
    }
}
