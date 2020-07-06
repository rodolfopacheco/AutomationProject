package com.nearsoft.school.automationproject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DressesTest extends BaseTest{

    @Test
    public void AddDressesToShoppingCartList(){
        //Go to Dresses page from the menu.
        landingPage.selectFromMenu("Dresses");

        //Select List from the view selector.
        dressesPage.clickListOption();

        //Click Add to Cart button
        dressesPage.addProductToCart();

        //Check if product frame was displayed
        Assert.assertTrue(dressesPage.isProductAddedFormDisplayed(),"Product Frame is displayed.");

        //Check 'Product Successfully added to your shopping cart' message is displayed
        Assert.assertTrue(dressesPage.isProductSuccessfullyAddedMsgDisplayed(),"Product added successfully message displayed");
    }

    @Test
    public void AddDressesToShoppingCartGrid(){
        //Go to Dresses page from the menu.
        landingPage.selectFromMenu("Dresses");

        //Select Grid from the view selector.
        dressesPage.clickGridOption();

        //Mouseover any item from the catalog.
        dressesPage.hoverItem();

        //Click Add to Cart button
        dressesPage.addProductToCart();

        //Check if product frame was displayed
        Assert.assertTrue(dressesPage.isProductAddedFormDisplayed(),"Product Frame is displayed.");

    }
}
