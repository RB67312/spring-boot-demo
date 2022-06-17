package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String sayHelloo() {
		return "<h1>Hello guys</h1>";
	}
		@RequestMapping("/pqr")
		public String sayPqr() {
			return "<h1>I am Raghav</h1>";
	}

}
