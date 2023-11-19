package Spring_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class test {
	public static void main(String[] args) {
		
		Book book=new Book();
		book.id=5555555555555L;
		
		ConfigurableApplicationContext context=SpringApplication.run(test.class, args);
		
		Book books=context.getBean(Book.class);
		System.out.println(book.id);
	}

}
