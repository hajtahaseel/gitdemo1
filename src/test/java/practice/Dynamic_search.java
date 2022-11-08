package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
	WebElement wb=	driver.findElement(By.name("q"));
		wb.sendKeys("Amazon");
		wb.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		
		System.out.println(driver.getTitle());
	}

}
