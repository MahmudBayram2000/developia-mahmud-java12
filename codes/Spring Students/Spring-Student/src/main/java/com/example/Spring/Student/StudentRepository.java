package com.example.Spring.Student;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	List<StudentEntity> findAllByOwner(String username);
	
}
