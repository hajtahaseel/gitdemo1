package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("li:nth-child(4) > a:nth-child(1) > span");
	By validat=By.cssSelector("div[class='container'] div[class='text-center']");//
	By head=By.cssSelector("div[class='container'] div[class='text-center']");
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement getlogin() {
		return driver.findElement(signin);
	}
	public WebElement validate() {
		return driver.findElement(validat);
	}
	
	public WebElement headerval() {
		return driver.findElement(head);
	}
	
}
