package in.ashokit.com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetWelcomeMessage {
	
	@Autowired
	private Environment environment;

	@GetMapping("/Welcome")
	public String GetWelcommessage() {
		
		String port = environment.getProperty("server.port");
		
		String msg = "Welcome to ashokit("+port+")";
	
		return msg;
		
	}
}
