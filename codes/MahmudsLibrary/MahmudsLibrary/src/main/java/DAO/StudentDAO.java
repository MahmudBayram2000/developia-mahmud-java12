package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.StudentEntity;

	
	@Repository
	public interface StudentDAO extends JpaRepository<StudentEntity, Integer>{
		
}

