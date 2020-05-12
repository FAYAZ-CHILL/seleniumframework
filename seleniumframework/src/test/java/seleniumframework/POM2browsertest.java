package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectlocators.POM2;

public class POM2browsertest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		hosteladminlogin();
	}
	public static void hosteladminlogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ghs.winhms.com:8005");
		driver.manage().window().maximize();
		POM2 adminlogin = new POM2(driver);
		adminlogin.usernamefield("adminxx");
		adminlogin.passwordfield("admin456");
		adminlogin.siginbutton();
	}
	
}
