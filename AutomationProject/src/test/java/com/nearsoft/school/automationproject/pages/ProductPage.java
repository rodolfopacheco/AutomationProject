package com.nearsoft.school.automationproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    private By productHeader = By.xpath("//div[contains(@class,'primary_block row')]//h1");

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public String getHeaderText (){
        return getText(productHeader);
    }
}
