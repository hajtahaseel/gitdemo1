package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String PID=it.next();
		String CID=it.next();
		driver.switchTo().window(CID);
		String txt=driver.findElement(By.cssSelector("div.page-wrapper:nth-child(1) section.courses-section div.container-fluid div.sec-title.clearfix div.pull-left > h2:nth-child(1)"))
		.getText().split(" ")[0];
		System.out.println(txt);
		driver.switchTo().window(PID);
		driver.findElement(By.cssSelector("#username")).sendKeys(txt);
		
	}

}
