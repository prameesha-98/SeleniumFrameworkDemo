package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseClass {

    @Test
    public void testSuccessfulLoginAndAddToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Verify to the login with URL
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login Failed!");

        // Add product to the cart
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addProductToCart();
        productsPage.clickCartIcon();

        // Verify login to the cart page
        Assert.assertTrue(driver.getCurrentUrl().contains("cart.html"), "Not in Cart Page!");
    }
}