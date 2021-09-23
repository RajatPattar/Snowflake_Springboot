package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
@EnableJpaAuditing
public class HelloApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(HelloApplication.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h> hello world </h>";
	}

}
