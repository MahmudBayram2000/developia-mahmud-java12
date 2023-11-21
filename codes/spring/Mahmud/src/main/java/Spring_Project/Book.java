package Spring_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	
	public Book() {
			
	}
	public String name;
	public Long id;
	public int pageCount;
	public double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void getBean() {
			
	}
		
	}	
	

	


