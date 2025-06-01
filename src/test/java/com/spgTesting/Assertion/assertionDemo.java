package com.spgTesting.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionDemo {

    @Test
    void testTitle()
    {
        String exp_title="Opencart";
        String act_title="Openshop";
       // String act_title="Opencart";

        //Normally we do like this but although test failed whole test result will passe only
//        if(exp_title.equals(act_title))
//        { System.out.println("Test passed.");}
//        else
//        {System.out.println("Test Failed");}

        //for that in TestNG assertion is used
        //Assert.assertEquals(exp_title,act_title);

        //we can use if statement with assertion
        if(exp_title.equals(act_title))
        {   Assert.assertTrue(true); }
        else
        {  Assert.assertTrue(false);}


    }
}
