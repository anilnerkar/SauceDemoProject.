package com.sauceDemoProject.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemoProject.Page.LoginPage;


public class TC_01_VerifyLoginFunctionality extends BaseClass {

	@Test()
	public void verifyLoginFunctionality() throws IOException {

		LoginPage LP = new LoginPage(driver);
		LP.sendUsername();
		log.info("username is entered");
		LP.sendPassword();
		log.info("password is entered");
		LP.clickOnLoginButton();
		log.info("click on Login Button");
		
		
		

		log.info("apply the validation");

		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title---> " + actualTitle);

		Assert.assertEquals(actualTitle, expectedTitle,"Failed due to Title mismatch");
		captureScreenShot(driver,"verify Login Functionality");
		
	}

}
