package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    public void addProductToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }
}