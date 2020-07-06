package com.nearsoft.school.automationproject.tests;

import com.nearsoft.school.automationproject.framework.DriverHandler;
import com.nearsoft.school.automationproject.pages.DressesPage;
import com.nearsoft.school.automationproject.pages.LandingPage;
import com.nearsoft.school.automationproject.pages.ProductPage;
import com.nearsoft.school.automationproject.pages.WomenPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public abstract class BaseTest {

    protected LandingPage landingPage;
    protected DressesPage dressesPage;
    protected ProductPage productPage;
    protected WomenPage womenPage;

    protected BaseTest(){
        landingPage = new LandingPage(getDriver());
        dressesPage = new DressesPage(getDriver());
        productPage = new ProductPage(getDriver());
        womenPage = new WomenPage(getDriver());
    }

    private WebDriver getDriver(){
        return DriverHandler.getWebDriver();
    }

    @BeforeMethod
    public void setupTest(){
        DriverHandler.getWebDriver().get("http://automationpractice.com/");
    }

    @AfterMethod
    public void teardownTest(){
        DriverHandler.clearWebDriver();
    }

    @AfterSuite
    public static void teardownSuite(){
        DriverHandler.teardownWebDriver();
    }
}
