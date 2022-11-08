package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_utility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(3000);
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("Dec"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> days=driver.findElements(By.className("day"));
		int count =days.size();
		//int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++) 
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("12")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		

	}

}
