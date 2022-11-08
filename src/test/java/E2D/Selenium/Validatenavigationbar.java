package E2D.Selenium;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class Validatenavigationbar extends Base{
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void chomeopen() throws IOException {
		driver=InitialiseDriver();
		driver.get(prop.getProperty("url"));
		log.info("initialization done");
	}
	@Test
	public void validatebar() throws IOException {
		
		
		LandingPage lap=new LandingPage(driver);
		Assert.assertTrue(lap.headerval().isDisplayed());
		log.info("navigation is valiated");
	}
	@AfterTest
	public void chomeclose() throws IOException {
		driver.quit();
		log.info("chrome closed");
	}

}
