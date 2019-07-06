package main.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloWordController {
	@RequestMapping("/ali")
	public String index() {
		return "hello jenkins of 2";
	}
}
