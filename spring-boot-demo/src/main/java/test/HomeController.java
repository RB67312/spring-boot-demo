package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HomeController {
	@RequestMapping("/")
	public String sayHello() {
		return "<h2> Welcome to string boot </h2>";
	}

}
