package com.example.Spring.Student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController

@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")

public class UserController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping(path = "/login")
	public String login() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();

		Optional<UserEntity> findById = repository.findById(username);
		UserEntity userEntity = findById.get();
		String type = userEntity.getType();
		System.out.println(type);
		return type;

	}
	
	
	@PostMapping(path = "/signup")
	public void signup(@Valid @RequestBody UserEntity user, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException("Melumatlarin tamligi pozulub", br);

		}
		
		if(repository.findById(user.getUsername()).isPresent()) {
			throw new OurRuntimeException("bu username artiq qeydiyyat olunub", null);
		}
		
		user.setEnabled(true)
		;
		user.setPassword("{noop}"+user.getPassword());
		user.setType("ADMIN");
		repository.save(user);
		
		repository.addAdminAuthorities(user.getUsername());
		
		
	

	}

}
	
	


