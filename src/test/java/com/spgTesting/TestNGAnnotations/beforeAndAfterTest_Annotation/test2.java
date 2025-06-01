package com.spgTesting.TestNGAnnotations.beforeAndAfterTest_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class test2 {

    @Test
    void xyz()
    {
        System.out.println("This is xyz method from c2 class");
    }



    @AfterClass
    void at()
    {
        System.out.println("This is after test method.");
    }
}
