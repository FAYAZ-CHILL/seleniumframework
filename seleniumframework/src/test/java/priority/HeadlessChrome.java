package priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://ghs.winhms.com:8005");
		System.out.println(driver.getTitle());
		System.out.println("test completed");
	}

}
