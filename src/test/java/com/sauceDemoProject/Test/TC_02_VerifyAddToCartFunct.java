package com.sauceDemoProject.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemoProject.Page.HomePage;
import com.sauceDemoProject.Page.LoginPage;

public class TC_02_VerifyAddToCartFunct extends BaseClass {

	@Test
	public void AddToCart() throws IOException, InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.login();

		Thread.sleep(2000);

		HomePage hp = new HomePage(driver);
		hp.clickBagButton();
		log.info("Bag product will get selected");

		// --validation--//
		String expectedProduct = "1";

		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->" + actualProduct);

		System.out.println("apply validation");

		Assert.assertEquals(actualProduct, expectedProduct);
		captureScreenShot(driver, "Verify Add To cart Bag");
	}
}
