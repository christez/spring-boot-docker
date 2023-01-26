package mx.christez.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreeController {
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/three")
	public String three() {
		logger.info("Inside \"three\" method");
		
		return "three";
	}
}
