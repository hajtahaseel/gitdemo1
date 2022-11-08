package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a=new SoftAssert();
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li'] //a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			//System.out.println(url);
		HttpURLConnection conn	=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responsecode=conn.getResponseCode();
		a.assertTrue(responsecode<400, "The broken link is"+ link.getText()+ responsecode);
		
		}a.assertAll();//imp point
	}

}
