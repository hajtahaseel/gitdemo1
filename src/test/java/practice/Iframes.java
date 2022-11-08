package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(),'Demos')]")).click();
		System.out.println(driver.getTitle());
		
	}

}
