package com.nearsoft.school.automationproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LandingPage extends BasePage {

    private By cartPreviewLink = By.xpath("//div[contains(@class,'shopping_cart')]/a");
    private By emptyShoppingCart = By.className("alert-warning");
    private By orderPage = By.id("order");
    private By searchBoxBy = By.id("search_query_top");
    private By autoCompleteOption = By.cssSelector("li.ac_even:nth-child(3)");
    private By productPage = By.id("product");
    private By productsList = By.xpath("//ul[contains(@class,'product_list')]//a[contains(@title,'Add to cart')]");
    private By closeOrderPage = By.xpath("//div[contains(@id,'layer_cart')]//span[contains(@class,'cross')]");

    public LandingPage (WebDriver driver){
        super(driver);
    }

    public void clickShoppingCart(){
        click(cartPreviewLink);
    }

    public boolean orderPageDisplayed(){
        return isElementDisplayed(orderPage,5);
    }

    public boolean alertMessageDisplayed(){
        return isElementDisplayed(emptyShoppingCart,5);
    }

    public void selectFromMenu(String menuTitle) {
        click(By.cssSelector("#block_top_menu > ul > li > a[title=" + menuTitle + "]"));
        WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".category-name")));
    }

    public void searchProduct(String keys){
        type(searchBoxBy,keys);
    }

    public void selectOptionAutocomplete(){
        WebElement element = new WebDriverWait(getDriver(), 5).until((ExpectedConditions.visibilityOfElementLocated(autoCompleteOption)));
        if (element != null) {
            click(autoCompleteOption);
        }
    }

    public boolean productPageDisplayed(){
        return isElementDisplayed(productPage,5);
    }

    public void addProductsToCart(int numberToAdd){
        List<WebElement> products = findElements(productsList);
        int i = 0;
        for(WebElement p : products) {

          /*  WebElement element = new WebDriverWait(getDriver(), 5).until((ExpectedConditions.visibilityOfElementLocated(productsList)));
            if (element != null) {
                p.click();
            }

            WebElement element = new WebDriverWait(getDriver(), 5).until((ExpectedConditions.visibilityOfElementLocated(closeOrderPage)));
            if (element != null) {
                click(closeOrderPage);
            }

            i++;
            if (i == numberToAdd){
                break;
            }*/
        }
    }
}
