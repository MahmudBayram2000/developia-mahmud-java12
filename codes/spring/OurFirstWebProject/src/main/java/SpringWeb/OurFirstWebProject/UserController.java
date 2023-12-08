package SpringWeb.OurFirstWebProject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping(path="/users")
@CrossOrigin
public class UserController {

@GetMapping(path="/loginS")
	public void login() {
	
}
}
