package SpringWeb.OurFirstWebProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path="/products")
public class ProductController {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	@PreAuthorize(value="hasAuthority('ROLE_ADD_PRODUCT')")
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		
		product.setRegister(LocalDateTime.now());
		product.setId(null);
		System.out.println(product);
		productRepository.save(product);
			
	}
	@PreAuthorize(value="hasAuthority('ROLE_GET_PRODUCT')")
	@GetMapping 
	public List<Product> findAll(){
		
		return productRepository.findAll();
	}
	
	
		
	@PreAuthorize(value="hasAuthority('ROLE_DELETE_PRODUCT')")
	@DeleteMapping(path="/{id}")
	public String deleteById (@PathVariable Integer id) {
		Optional<Product> finded=productRepository.findById(id);
		
		if (finded.isPresent()) {
			
			productRepository.deleteById(id);
			return "Find and deleted";
		}else {
			return "I did not find id,id="+id;
		}
		
	}
	@PreAuthorize(value="hasAuthority('ROLE_UPDATE_PRODUCT')")
	@PutMapping
	public void update(@RequestBody Product product) {
		
		if(product.getId()==null || product.getId()<1) {
			
			throw new RuntimeException("Id is empty");
		}
		
    Optional<Product> finded=productRepository.findById(product.getId());
		
		if (finded.isPresent()) {
			
			productRepository.save(product);
		}else {
			throw new RuntimeException("Id is not find");
		}
		
	}
		
		
	
	@ExceptionHandler
	public String Exception(RuntimeException e) {
		return e.getMessage();
	}
	
	
	
	@GetMapping(path="/all")
	public String test() {
		
		return "test";
	}
	
	
	
	}
	
	
	
	
