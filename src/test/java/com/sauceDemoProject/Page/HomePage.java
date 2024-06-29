package com.sauceDemoProject.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;

	public void clickBagButton() {
		bagButton.click();
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement shoppingCart;

	public void clickOnCart() {
		shoppingCart.click();
	}

	public String getTextFromAddToCart() {
		String totalProducts = shoppingCart.getText();
		return totalProducts;
	}

}
