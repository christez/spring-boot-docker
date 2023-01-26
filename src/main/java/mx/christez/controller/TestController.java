package mx.christez.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test")
	public String test() {
		logger.info("Inside \"test\" method");
		
		return "test";
	}
}
