package com.example.Spring.Student;

import java.util.Optional;

import jakarta.validation.Valid;

public class UserRepository {
	
	public Optional<UserEntity> findById(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(@Valid UserEntity user) {
		// TODO Auto-generated method stub
		
	}

	public void addAdminAuthorities(String username) {
		// TODO Auto-generated method stub
		
	}

}

