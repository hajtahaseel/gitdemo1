package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		 
	
			
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			String eTitle = "Demo Guru99 Page";
			String aTitle = "" ;
			// launch Chrome and redirect it to the Base URL
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://demo.guru99.com/test/guru99home/" );
			//Maximizes the browser window
			driver.manage().window().maximize() ;
			//get the actual value of the title
			aTitle = driver.getTitle();
			//compare the actual title with the expected title
			if (aTitle.contentEquals(eTitle))
			{
			System.out.println( "Test Passed") ;
			}
			else {
			System.out.println( "Test Failed" );
			}
			WebElement guru99seleniumlink;
			guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//body/div[3]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")));
			guru99seleniumlink.click();
			driver.quit();
			}
			
	}

	


