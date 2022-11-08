package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("testing");
		////body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]
		////ul[@role='listbox']//li/descendant::div[@class='wM6W7d']/span
		List<WebElement>options=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span"));
	Thread.sleep(2000);
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
			if (options.get(i).getText().contains("testing tools")) {
				options.get(i).click();
				break;
				
			}
			
		}
		
	}

}
