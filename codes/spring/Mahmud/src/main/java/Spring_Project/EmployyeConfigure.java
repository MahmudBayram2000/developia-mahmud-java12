package Spring_Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployyeConfigure {
	
@Bean
public Employee employee() {
	return new Employee();
}

}
