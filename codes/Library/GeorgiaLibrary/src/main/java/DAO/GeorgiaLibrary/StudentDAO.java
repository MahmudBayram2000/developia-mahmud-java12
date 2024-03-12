package DAO.GeorgiaLibrary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.GeorgiaLibrary.StudentEntity;

	
	@Repository
	public interface StudentDAO extends JpaRepository<StudentEntity, Integer>{
		
}

