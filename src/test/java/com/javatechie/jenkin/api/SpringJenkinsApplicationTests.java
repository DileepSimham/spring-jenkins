package com.javatechie.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals; // Import statement for assertEquals


@SpringBootTest
class SpringJenkinsApplicationTests {
	
	static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
