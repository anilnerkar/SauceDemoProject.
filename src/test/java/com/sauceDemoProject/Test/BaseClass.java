package com.sauceDemoProject.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sauceDemoProject.Page.LoginPage;
import com.sauceDemoProject.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public static WebDriver driver;
	Logger log = Logger.getLogger("SauceDemoProject");

	public String url = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());

		driver = new ChromeDriver();
		driver.get(url);
		log.info("url is Entered");

		log.info("Browser is opened");

		driver.manage().window().maximize();
		log.info("Browser is maximized");

		Thread.sleep(2000);

		captureScreenShot(driver, "Verify Login Page");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterMethod
	public void tearDown() {

		driver.close();

		log.info("Browser is closed");

	}

	public void captureScreenShot(WebDriver driver, String testName) throws IOException {

		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		File src = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

		FileUtils.copyFile(src, dest);
	}
}
