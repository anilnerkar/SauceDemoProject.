package com.sauceDemoProject.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement shoppingcart;

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkout;

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalcode;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;

	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;

	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement thankYouMessage;
	
	public void clickonShoppingcartlink() {
		shoppingcart.click();
	}

	public void clickOnCheckout() {
		checkout.click();
	}

	public void enterFirstName() {
		firstName.sendKeys("Anil");
	}

	public void enterLastName() {
		lastName.sendKeys("Nerkar");
	}

	public void enterpostalcode() {
		postalcode.sendKeys("441905");
	}

	public void clickOnContinue() {
		continuebutton.click();
	}

	public void ClickOnFinish() {
		finish.click();
	}
     
	public void thankYou()
	{
	
	}
	
	
}
