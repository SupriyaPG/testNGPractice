package com.spgTesting.TestNGAnnotations.Grouping;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1,groups = {"Sanity","Regression","Functional"})
    void paymentInRupees()
    {
        System.out.println("Payment in rupees.");

    }

    @Test(priority = 2,groups = {"Sanity","Regression","Functional"})
    void paymentInDollars()
    {
        System.out.println("Payment in dollars.");

    }

}
