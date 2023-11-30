package SpringWeb.OurFirstWebProject;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WedontNeedName {
	
	@ExceptionHandler
	public String Exception(RuntimeException e) {
		return e.getMessage();
	
}
}
