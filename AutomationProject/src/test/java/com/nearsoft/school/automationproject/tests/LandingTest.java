package com.nearsoft.school.automationproject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends BaseTest{

    @Test
    public void Landing_UserNavigatesToEmptyCart(){
        //Click on the Shopping Cart.
        landingPage.clickShoppingCart();

        //Check Order page is displayed.
        Assert.assertTrue(landingPage.orderPageDisplayed(), "Order page is displayed");

        //Check the Shopping Cart List empty message.
        Assert.assertTrue(landingPage.alertMessageDisplayed(),"Empty Shopping Cart Alert is Displayed");
    }

    @Test
    public void Landing_UserSearchesProduct(){
        //Search product.
        landingPage.searchProduct("Summer ");

        //Search text in autocomplete.
        landingPage.selectOptionAutocomplete();

        //Check if product page was displayed.
        Assert.assertTrue(landingPage.productPageDisplayed(),"Product page is displayed");

        Assert.assertEquals(productPage.getHeaderText(),"Printed Chiffon Dress","Product name ‘Printed Chiffon Dress’ is displayed.");
    }

    @Test
    public void Landing_UserRemovesProducts(){
        //Add products to Shopping Cart.
        landingPage.addProductsToCart(2);
    }
}
