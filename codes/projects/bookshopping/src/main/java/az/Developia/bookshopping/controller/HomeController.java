package az.Developia.bookshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path="/home")
	public String ShowHomePage() {
		return "home.html";
	}
	
	
	
	

}
