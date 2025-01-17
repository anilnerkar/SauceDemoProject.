package com.sauceDemoProject.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;

	public void sendUsername() {
		username.sendKeys("standard_user");
	}

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	public void sendPassword() {
		password.sendKeys("secret_sauce");
	}

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginButton;

	public void clickOnLoginButton() {

		loginButton.click();

	}

	public void login() {

		sendUsername();
		sendPassword();
		clickOnLoginButton();

	}

}
