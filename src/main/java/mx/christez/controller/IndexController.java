package mx.christez.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import mx.christez.service.MessageService;

@Controller
public class IndexController {
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/")
	public String index() {
		logger.info("Inside \"index\" method. Message service says: " + messageService.greet());
		
		return "index";
	}
}
