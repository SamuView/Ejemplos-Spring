package viewnext.cursos.springboot.Springboothelloworld.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import viewnext.cursos.springboot.Springboothelloworld.models.Greeting;

@RestController
public class GreetingController {

	private final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greet(@RequestParam(value = "name", defaultValue = "User") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}