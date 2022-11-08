package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Amazon");
		
		Thread.sleep(3000);
		List<WebElement> ss=driver.findElements(By.xpath("//div[@class='mkHrUc']//ul//div//ul/li"));
		for (WebElement a:ss) {
			System.out.println(a.getText() );
			if(a.getText().equalsIgnoreCase("Amazon india")) {
				a.click();
				Thread.sleep(3000);
				break;
				
				
			} 
		}
				driver.close();
		
		
		
		
		
		
		
		
		//ll.sendKeys(Keys.ENTER);
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("D:\\Selenium\\SC\\screns.png"));
		
		

	}

}
