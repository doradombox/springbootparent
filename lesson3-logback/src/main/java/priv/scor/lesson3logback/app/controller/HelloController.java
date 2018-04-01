package priv.scor.lesson3logback.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final static Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "123";
	}
}
