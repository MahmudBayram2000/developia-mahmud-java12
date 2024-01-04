package com.example.Spring.Student;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/students")
@CrossOrigin(origins = "*")
public class StudentController {
	
@Autowired
public StudentRepository studentRepository;

@PostMapping
@PreAuthorize(value = "hasAuthority('ROLE_ADD_STUDENT')")

public void addStudent(@Valid @RequestBody Student student,BindingResult br) {

if (br.hasErrors()) {
	
}

}

}
