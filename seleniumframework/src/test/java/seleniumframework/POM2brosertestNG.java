package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesfile;
import objectlocators.POM2;

public class POM2brosertestNG {
	WebDriver driver = null;
	public static String browserName = null;
	@BeforeTest
	public void setup() {
		propertiesfile.getproperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void sitelogin() {
		driver.get("https://ghs.winhms.com:8005");
		driver.manage().window().maximize();
		POM2 adminlogin = new POM2(driver);
		adminlogin.usernamefield("adminxx");
		adminlogin.passwordfield("admin456");
		adminlogin.siginbutton();
	}
	@AfterTest
	public void quit() {
		driver.quit();
		propertiesfile.setproperties();
	}

}
