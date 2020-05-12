package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {
	
	private static Logger logger = LogManager.getLogger(log4j.class);
	public static void main(String[] args) {
	
		System.out.println("\n   hello world...!");
		
		logger.trace("this is trace message");
		logger.info("this is information message");
		logger.error("this is error message");
		logger.warn("this is warn message");
		logger.fatal("this is fatal message");
		
		System.out.println("\n   completed");
	
		
		
	
	}

}
