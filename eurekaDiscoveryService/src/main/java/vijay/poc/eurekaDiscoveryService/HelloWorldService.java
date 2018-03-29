package vijay.poc.eurekaDiscoveryService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello, World";
	}
	
	
}
