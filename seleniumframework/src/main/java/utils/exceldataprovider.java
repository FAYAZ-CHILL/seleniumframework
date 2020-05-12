package utils;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.propertiesfile;

public class exceldataprovider {
	
	WebDriver driver = null;
	@BeforeTest
	public void setup() {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
					
	}
	@Test(dataProvider = "TestSheet1")
	public void test (String username, String password) {
		System.out.println(username+"|"+password);
		driver.get("https://ghs.winhms.com:8005");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	@DataProvider(name = "TestSheet1")
	public Object[][] getdata() {
		String excelpath = "C:\\Users\\user\\eclipse-workspace\\seleniumframework\\excel\\data.xlsx";
		Object data[][] = testdata(excelpath, "Sheet1");
		return data;
	}

	public Object[][] testdata(String excelpath, String sheetname) {
		excelutils excel = new excelutils(excelpath, sheetname);
		int rowcount = excel.getrowcount();
		int colcount = excel.getcolcount();
		Object data[][] = new Object[rowcount-1][colcount];
		
		for(int i=1; i<rowcount; i++){
			for(int j=0; j<colcount; j++){
			String cellData = excel.readcelldata(i, j);
			//System.out.print(cellData+ " | ");
			data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}
	
}
