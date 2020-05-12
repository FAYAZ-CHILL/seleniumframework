package seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectlocators.loginlocators;
public class browsertest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		hostellogin();
	}
	
	public static void hostellogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ghs.winhms.com:8005");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("adminxx");
		//driver.findElement(By.id("password")).sendKeys("admin456");
		//driver.findElement(By.id("SigninBtn")).click();
		loginlocators.username(driver).sendKeys("adminxx");
		loginlocators.password(driver).sendKeys("admin456");
		loginlocators.signin(driver).click();
		System.out.println("test completed successfully");
	}
}
