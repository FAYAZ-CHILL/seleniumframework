package priority;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabs {

	static String sauceUserName = System.getenv("FAYAZ94");
	static String sauceAccessKey = System.getenv("97cdf889-543d-45c6-ab6d-bad80edb51d0");
	static String sauceURL = "https://ondemand.saucelabs.com/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException  {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("username", sauceUserName);
		capabilities.setCapability("accessKey", sauceAccessKey);
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("platform", "Windows 10");
		capabilities.setCapability("version", "59.0");
		capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
		capabilities.setCapability("name", "3-cross-browser");

		//If you're accessing the EU data center, use the following endpoint:.
		//  * https://ondemand.eu-central-1.saucelabs.com/wd/hub
		//   * */
		RemoteWebDriver driver = new RemoteWebDriver(new URL(sauceURL), capabilities);

		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriver driver1 = new ChromeDriver();
		driver.get("https://ghs.winhms.com:8005");
		System.out.println("Title is:"+driver.getTitle());
	}


}


