package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("#user_email");
	By pwd=By.cssSelector("#user_password");
	By login=By.cssSelector("input[name='commit']");
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement emailID() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(pwd);
	}
	public WebElement loginm() {
		return driver.findElement(login);
	}
}
