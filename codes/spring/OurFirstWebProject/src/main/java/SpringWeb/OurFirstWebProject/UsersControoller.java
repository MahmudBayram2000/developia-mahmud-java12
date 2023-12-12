package SpringWeb.OurFirstWebProject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path="/users")
@CrossOrigin(origins= "*")
public class UsersControoller {
	
	
	@GetMapping(path="/login")
	public void login() {
		
	
}
}
