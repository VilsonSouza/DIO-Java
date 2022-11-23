package com.eumemu.TesteInitializr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@GetMapping("/")
	public String mensagem() {
		return "nosso primeiro projeto Spring Boot Web";
		
	}
}
