package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGMultiBrowser {
	WebDriver driver = null;
	@Parameters("browsername")
	@BeforeTest
	public void beforetest(String browsername) {
		System.out.println("browsername is :"+browsername);
		System.out.println("Thread id: "+Thread.currentThread().getId());
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test	
	public void test1() throws Exception {
		driver.get("https://ghs.winhms.com:8005");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("adminxx");
		driver.findElement(By.id("password")).sendKeys("admin456");
		driver.findElement(By.id("SigninBtn")).click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test completed successfully");
	}
}
