package practice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FromTO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		ChromeOptions ch = new ChromeOptions();
		//ch.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		ch.addArguments("--Headless");
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		//driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath(
		//		"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[text()='BLR']")).click();
		//driver.findElement(By.xpath("//div[text()='MAA']")).click();
		/*driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).sendKeys("chen");
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).sendKeys("beng");*/
		
		
	}

}
