package SpringWeb.OurFirstWebProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping(path="/student-object")
	public List<String> ShowMeStudentName(){
		List<String> list=new ArrayList<>();
		list.add("Mahmud");
		list.add("Bayram");
		list.add("Alixan");
		return list;
		
	}

}
