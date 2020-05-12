package seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportbasic {
	
	static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("adminlogin");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "starting test case");
		driver.manage().window().maximize();
		driver.get("https:\\ghs.winhms.com:8005");
		test.pass("site gone successfully");
		driver.findElement(By.id("username")).sendKeys("adminxx");
		test.pass("username given");
		driver.findElement(By.id("password")).sendKeys("admin456");
		test.pass("password given");
		driver.findElement(By.id("SigninBtn")).click();
		test.pass("signin clicked");
		extent.flush();
	}

}
