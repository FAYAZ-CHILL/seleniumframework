package config;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import seleniumframework.POM2brosertestNG;

public class propertiesfile {
	
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();
	}

	public static void getproperties() {
		try {
			InputStream input = new FileInputStream(projectpath+"/src/main/java/config/config.properties");	
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			POM2brosertestNG.browserName = browser;
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	public static void setproperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/main/java/config/config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		
	}
}
}

