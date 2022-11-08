package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver InitialiseDriver() throws IOException {
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Projects\\E2EProject\\E2EProject\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome exe\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}else if(browsername=="gecho") {
		//
	}else if(browsername=="IE") {
		
	}
	
	return driver;	
	}
	
	public void  getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		//return destinationFile;
		


	}

	
	}


