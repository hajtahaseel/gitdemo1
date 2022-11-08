package practice;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Practice {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//select[@id='form-field-travel_comp_language']")).click();
		while(!driver.findElement(By.cssSelector("")).getText().contains("Janauary"))
			
		{
			driver.findElement(By.xpath("")).click();
		}
		List<WebElement>dates=driver.findElements(By.xpath(""));
	int size=	driver.findElements(By.xpath("")).size();
		for(int i=0;i<size;i++) 
		{
		String dat=driver.findElements(By.xpath("")).get(i).getText();	
		if(dat.equalsIgnoreCase("18")) {
			driver.findElement(By.xpath("")).click();
			
		}
		}
	
	
	
	}

}
