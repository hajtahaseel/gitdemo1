package practice;

import static org.testng.Assert.assertTrue;

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

public class Pactice2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert as=new SoftAssert();
		List<WebElement>all=driver.findElements(By.xpath(""));
		for(WebElement e:all) {
			String url=e.getAttribute("Href");
		HttpURLConnection req=(HttpURLConnection)	new URL(url).openConnection();
			req.setRequestMethod("HEAD");
			req.connect();
			int rescode=req.getResponseCode();
			as.assertTrue(rescode<400, "pass");
			
		}as.assertAll();
	}

}
