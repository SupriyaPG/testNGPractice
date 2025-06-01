package com.spgTesting.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_AssertionVsHardAssertion {

    // In hard assertion if test failed next set of statements can not execute
    // but in soft assertion if test failed next set of statements anyhow executes

    @Test
        void test_hardAsserion()
        {
            System.out.println("Hard Assertion");

            System.out.println("testing......");
            System.out.println("testing......");

            Assert.assertEquals(1,2); //hard assertion

            System.out.println("testing......");
            System.out.println("testing......");
        }

     @Test
    void test_softAsserion()
    {
        System.out.println("Soft Assertion");

        System.out.println("testing......");
        System.out.println("testing......");

        SoftAssert sa=new SoftAssert();  // create object of soft assert
        sa.assertEquals(1,2); //soft assertion

        System.out.println("testing......");
        System.out.println("testing......");
    }

}
