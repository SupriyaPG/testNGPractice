package com.spgTesting.TestNGAnnotations.beforeAndAfterTest_Annotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

    @Test
    void abc()
    {
        System.out.println("This is abc method from c1 class");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("This is before test method.");
    }


}
