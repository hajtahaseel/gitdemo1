package list;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngg {
	@Test(dataProvider="getdata")
	public void mbd(String usr, String pwd) {
		System.out.println(usr);
		System.out.println(pwd);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[1][0] = "u2";
		data[1][1] = "p2";
		data[2][0] = "u3";
		data[2][1] = "p3";
		return data;
	}
}
