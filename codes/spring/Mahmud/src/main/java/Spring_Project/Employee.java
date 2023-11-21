package Spring_Project;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String id;
	private String name;
	private int age;
	private double salary;
	private String surname;
	
 public Employee () {
	 
	 this.id="192531411";
	 this.name="Mahmud";
	 this.surname="Bayramov";
	 this.age=23;
	 this.salary=1250.0;
	  	 
 }

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

}
