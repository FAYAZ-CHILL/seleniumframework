package objectlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
	WebDriver driver = null;
	By username = By.id("username");
	By password = By.id("password");
	By signin = By.id("SigninBtn");
	public POM2(WebDriver driver) {
		this.driver = driver;
	}
	public void usernamefield (String text) {
		driver.findElement(username).sendKeys(text);
	}
	public void passwordfield(String text) {
		driver.findElement(password).sendKeys(text);
	}
	public void siginbutton() {
		driver.findElement(signin).click();
	}
}
