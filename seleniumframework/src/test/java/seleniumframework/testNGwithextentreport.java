package seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class testNGwithextentreport {
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver;

	@BeforeSuite
	public void htmlattachment() {
		htmlReporter = new ExtentHtmlReporter("extentNG.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void logintest() {
		ExtentTest test = extent.createTest("adminlogin");
		test.log(Status.INFO, "starting test case");
		driver.manage().window().maximize();
		driver.get("https:\\test1dns.winbeds.com:5005");
		test.pass("site gone successfully");
		driver.findElement(By.id("username")).sendKeys("adminxx");
		test.pass("username given");
		driver.findElement(By.id("password")).sendKeys("admin456");
		test.pass("password given");
		driver.findElement(By.id("SigninBtn")).click();
		test.pass("signin clicked");
	}

	@AfterTest
	public void webdriverquit() {
		driver.quit();
	}
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
}
