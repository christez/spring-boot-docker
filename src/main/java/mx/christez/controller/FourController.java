package mx.christez.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourController {
	Logger logger = LoggerFactory.getLogger(FourController.class);
	
	@GetMapping("/four")
	public String three() {
		logger.info("Inside \"four\" method");
		
		return "four";
	}
}
