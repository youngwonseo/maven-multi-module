package io.youngwon.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "io.youngwon.web")
@RestController
public class Application {
	
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}	
