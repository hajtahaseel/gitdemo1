package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MonkeyTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		List<WebElement>footerlist=driver.findElements(By.cssSelector("div.navLeftFooter li a"));
		int footerlink=footerlist.size();
		System.out.println(footerlink);
		
		for(int i=0;i<footerlink;i++) {
			int rv=(int) Math.floor(Math.random()*footerlink);//
			System.out.println("count number "+rv);
			
			WebElement e=footerlist.get(rv);
			System.out.println(e.getText());
			e.click();
			driver.navigate().back();
			footerlist=driver.findElements(By.cssSelector("div.navLeftFooter ul li a"));
		}
		
		
		
	}

}
