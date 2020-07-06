package com.nearsoft.school.automationproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DressesPage extends BasePage{

    private By listOption = By.xpath("//li[contains(@id,'list')]/a");
    private By gridOption = By.xpath("//li[contains(@id,'grid')]/a");
    private By addItemToCart = By.xpath("//ul[contains(@class,'product_list')]//a[contains(@title,'Add to cart')]");
    private By productAddedFrame = By.xpath("//div[contains(@id,'layer_cart')] [contains(@style,'display: block')]");
    private By productSuccessfullyAddedMsg = By.className("icon-ok");
    private By item = By.xpath("//div[contains(@class,'product-image-container')]//img");

    public DressesPage(WebDriver driver){
        super(driver);
    }

    public void clickListOption(){
        click(listOption);
    }

    public void clickGridOption(){
        click (gridOption);
    }

    public void addProductToCart(){
        click(addItemToCart);
    }


    public boolean isProductAddedFormDisplayed(){
        return isElementDisplayed(productAddedFrame, 5);
    }

    public boolean isProductSuccessfullyAddedMsgDisplayed(){
        return isElementDisplayed(productSuccessfullyAddedMsg, 5);
    }

    public void hoverItem(){
        hover(item);
    }
}
