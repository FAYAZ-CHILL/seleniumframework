package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGlistners {

	@Test
	public void test1() {
		System.out.println("i am insde test1");
	}
	
	@Test
	public void test2() {
		System.out.println("i am inside test2");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ghs.winhms.com:8005");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("adminxx");
		driver.findElement(By.id("passwo")).sendKeys("admin456");
		driver.findElement(By.id("SigninBtn")).click();
		driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("i am inside test3");
		throw new SkipException("test is skipped");
	}
}
