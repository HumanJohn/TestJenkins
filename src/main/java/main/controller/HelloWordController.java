package main.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloWordController {
	@RequestMapping("/ali")
	public String index() {
		return "tomcat合二为一8080";
	}
	
	@RequestMapping("/yaoyiyao")
	public String yaoyiyao() {
		return "tomcat合二为一8080";
	}
	
	
}
