package practice;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SSLCerts {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions ch=new ChromeOptions();
		ch.setAcceptInsecureCerts(true);
		/*Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		options.setCapability("proxy", proxy);*/
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	
		}
}
