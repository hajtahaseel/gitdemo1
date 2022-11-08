package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("3334");
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().accept();
	String text=driver.switchTo().alert().getText();
	Assert.assertEquals("Customer Successfully Delete!", text);
	driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
