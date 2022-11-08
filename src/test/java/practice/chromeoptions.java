package practice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class chromeoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ch=new ChromeOptions();
		
		//accept ssl certs
		ch.setAcceptInsecureCerts(true);
		
		//proxy
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("144.33.33.3");
		ch.setCapability("proxy", proxy);
		//block pop up windows(asking location)
		ch.setExperimentalOption("excludeswitches", Arrays.asList("disable-popup-blocking"));
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
