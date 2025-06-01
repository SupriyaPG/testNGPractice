package com.spgTesting.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions {

    @Test
    void test()
    {
        //Assert.assertEquals("xyz","xyz");  //passed comparing diff string
        //Assert.assertEquals(123,345);  //failed comparing diff int

        //Assert.assertEquals("xyz",123);  //failed comparing string to int
        //Assert.assertEquals(123,123);  //passed comparing same int

        //Assert.assertNotEquals(123,254); //passed comparing negatively 2 int
        //Assert.assertNotEquals("xyz","xyz");  //failed comparing negatively 2 strings

        //boolean values
        Assert.assertTrue(true); // passed true value assertion
        Assert.assertTrue(false); // failed true value assertion
        Assert.assertTrue(1==2); // failed true value assertion
        Assert.assertTrue(2==2); // passed true value assertion

        Assert.assertFalse(true); // failed true value assertion
        Assert.assertFalse(false); // passed true value assertion
        Assert.assertFalse(1==2); // passed true value assertion
        Assert.assertFalse(2==2); // failed true value assertion

        Assert.fail();// intentionally failed the test


    }
}
