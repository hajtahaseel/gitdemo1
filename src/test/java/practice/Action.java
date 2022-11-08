package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).contextClick().build().perform();
		//WebElement he=driver.findElement(By.id("twotabsearchtextbox"));
	//a.moveToElement(he).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//driver.close();
		
	}

}
