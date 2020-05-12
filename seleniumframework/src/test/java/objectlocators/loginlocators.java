package objectlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
public class loginlocators {
	private static WebElement username = null;
	private static WebElement password = null;
	private static WebElement signin = null;
	public static WebElement username(WebDriver driver) {
	username = driver.findElement(By.id("username"));
	return username;
	}
	public static WebElement password(WebDriver driver) {
		password = driver.findElement(By.id("password"));
		return password;
	}
	public static WebElement signin(WebDriver driver) {
		signin = driver.findElement(By.id("SigninBtn"));
		return signin;
	}
	}
	
	


