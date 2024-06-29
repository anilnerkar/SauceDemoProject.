package com.sauceDemoProject.Test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemoProject.Page.CheckoutPage;
import com.sauceDemoProject.Page.LoginPage;

public class TC_03_VerifyCheckOutFunctionality extends BaseClass {

	@Test
	public void verifyCheckoutFuct() throws IOException {

		LoginPage Lp = new LoginPage(driver);
		Lp.login();

		CheckoutPage checkoutpage = new CheckoutPage(driver);
		checkoutpage.clickonShoppingcartlink();
		log.info("click on shoppingcart");

		checkoutpage.clickOnCheckout();
		log.info("clicked on checkouttab");

		checkoutpage.enterFirstName();
		log.info("entered first name");

		checkoutpage.enterLastName();
		log.info("entered last name");

		checkoutpage.enterpostalcode();
		log.info("entered postalcode");

		checkoutpage.clickOnContinue();
		log.info("clicked on continuebutton");

		checkoutpage.ClickOnFinish();
		log.info("click on Finish");
		
		captureScreenShot(driver,"Verify CheckOut Page");
		
		
		
	}

}
