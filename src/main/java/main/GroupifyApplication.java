package main;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroupifyApplication {
	
	final static Logger logger = Logger.getLogger(GroupifyApplication.class);

	public static void main(String[] args) {
		
		logger.info("Starting application...");
		SpringApplication.run(GroupifyApplication.class, args);
	}
}
