package com.nearsoft.school.automationproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage extends BasePage {

    private By listOption = By.xpath("//li[contains(@id,'list')]/a");
    private By firstProd = By.cssSelector("li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
    private By secondProd = By.cssSelector("li.ajax_block_product:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
    private By closePopUpPage = By.cssSelector(".cross");
    private By openCart = By.cssSelector(".shopping_cart > a:nth-child(1)");
    private By deleteProd = By.cssSelector(".ajax_cart_block_remove_link");
    private By cartCounter = By.cssSelector("span.ajax_cart_quantity:nth-child(2)");

    public WomenPage(WebDriver driver){
        super(driver);
    }

    public void clickListOption(){
        click(listOption);
    }

    public void addFirstProd(){
        click(firstProd);
        try {
            Thread.sleep(10000);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void addSecondProd(){
        click(secondProd);
        try {
            Thread.sleep(10000);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void closeOrderPage(){
        click(closePopUpPage);
    }

    public void openCartProd(){
        hover(openCart);

    }

    public void removeProd(){
        click(deleteProd);
        try {
            Thread.sleep(10000);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getCartCount(){
        return getText(cartCounter);
    }
}
