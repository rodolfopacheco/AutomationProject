package com.nearsoft.school.automationproject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest{

    @Test
    public void RemoveProductFromCart(){
        //Preconditions (Add 2 products)
        landingPage.selectFromMenu("Women");
        womenPage.clickListOption();

        womenPage.addFirstProd();
        womenPage.closeOrderPage();
        womenPage.addSecondProd();
        womenPage.closeOrderPage();

        //Open Cart
        womenPage.openCartProd();

        //Remove Product
        womenPage.removeProd();

        //Check product was removed.
        Assert.assertEquals(womenPage.getCartCount(),"1","Product was removed.");
    }
}
