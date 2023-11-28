package SpringWeb.OurFirstWebProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path="/product")
public class ProductController {
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		
		product.setRegister(LocalDateTime.now());
		System.out.println(product);
			
	}
	
	@GetMapping(path="/addingproduct")
	public List<Product> findAll() {
		
		List<Product> products=new ArrayList<Product>();
		
		products.add(new Product("Mahmud",2d,3d,"1234566584",LocalDateTime.now(), 1544855856));
		products.add(new Product("Bayram",4d,5d,"1234555584",LocalDateTime.now(), 1544855556));
		products.add(new Product("Orxan",6d,7d,"1234555584",LocalDateTime.now(), 1544855556));
		products.add(new Product("Bayram",8d,5d,"123455555584",LocalDateTime.now(), 1596955556));
		products.add(new Product("Bayram",8d,5d,"123455555584",LocalDateTime.now(), 1596955556));
		products.add(new Product("Bayram",8d,5d,"123455555584",LocalDateTime.now(), 1596955556));
		
		
		
		return products;
		
		
	}
	
	@DeleteMapping(path="/{id}")
	
	public void deleteById(@PathVariable Integer id) {
		
		
		System.out.println(1544855856);
	}
	
	

}
