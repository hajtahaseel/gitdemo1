package E2D.Selenium;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void chomeopen() throws IOException {
		driver=InitialiseDriver();
		log.info("initialization done");
	}
	@AfterTest
	public void chomeclose() throws IOException {
		driver.quit();
		log.info("Chrome is closed");
	}
	@Test(dataProvider="getdata")
	public void basepageNavigation(String username,String password) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage lap=new LandingPage(driver);
		lap.getlogin().click();
		LoginPage lop=new LoginPage(driver);
		lop.emailID().sendKeys(username);
		lop.password().sendKeys(password);
		lop.loginm().click();
		log.info("login page validated");
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] obj=new Object[2][2];
		
		obj [0][0]="haj";
		obj [0][1]="123";
		//obj[0][2]="";
		
		obj [1][0]="haj";
		obj [1][1]="123";
		//obj[1][2]="";
		return obj;
	}
	
}
