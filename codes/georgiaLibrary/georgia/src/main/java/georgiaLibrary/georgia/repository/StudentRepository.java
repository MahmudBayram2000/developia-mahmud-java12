package georgiaLibrary.georgia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import georgiaLibrary.georgia.entity.StudentEntity;

	
	@Repository
	public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
		
}
