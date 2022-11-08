package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table_ex {
	static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//naveen - https://www.youtube.com/watch?v=HOFy0dzEmHs
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome versions\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		gettablename("Germany");
	
	}
	
	public static boolean gettablename(String name) {
		boolean flag = false;
		int RC = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int CC=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		for(int i=1;i<RC;i++) {
			for(int j=1;j<=CC;j++) {
				String ss=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(ss.equals(name)) {
					flag=true;
					System.out.println("row number" +i+ " and columnn number "+j);
					break;
				}
			}
			if(flag) {
				return true;
			}
			
		}
		return flag;
		
	}
		
	


}

	
		
	

	


