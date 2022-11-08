package list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalparajava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Jay\\eclipse-workspace\\Selenium\\src\\test\\java\\list\\javaa.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "ff");
		
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Jay\\eclipse-workspace\\Selenium\\src\\test\\java\\list\\javaa.properties");
		prop.store(fos, null);
	}

}
