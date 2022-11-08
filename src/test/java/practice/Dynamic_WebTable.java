package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dynamic_WebTable {
///html/body/div[1]/header/div/nav/div/div/a
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/contacts");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("hajtahaseel1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Juna@1234");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		String bf= "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		String af= "]/td[2]/a";
	int RC=driver.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr")).size();
		for(int i=1;i<=RC;i++) {
			String txt=driver.findElement(By.xpath(bf+i+af)).getText();
			if(txt.contains("test2 test2")) {
				driver.findElement(By.xpath(bf+i+af)).click();
				
			}
		}
		
				
		
	}

}
