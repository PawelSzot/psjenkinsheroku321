package psjenkinsheroku321;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Psjenkinsheroku321Application {

	public static void main(String[] args) {
		SpringApplication.run(Psjenkinsheroku321Application.class, args);
	}

	@GetMapping
	public String get() {
		return "Hello Jenkins";
	}
}
