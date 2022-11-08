package practice;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		////
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum = 0;
		for (WebElement list : lists) {
			int values = Integer.parseInt(list.getText());
			sum = sum + values;
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);
		Assert.assertEquals(sum, total);
		driver.quit();
	}

}
