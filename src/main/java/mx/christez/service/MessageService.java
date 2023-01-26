package mx.christez.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String greet() {
		return "Hello, timestamp is " + System.currentTimeMillis();
	}
}
