package Spring_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployyeConfigure.class);
		
		Employee employee=context.getBean(Employee.class);
		
		System.out.println(employee.getName());
		System.out.println(employee.getSurname());
		System.out.println(employee.getId());
		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		
	}

}
