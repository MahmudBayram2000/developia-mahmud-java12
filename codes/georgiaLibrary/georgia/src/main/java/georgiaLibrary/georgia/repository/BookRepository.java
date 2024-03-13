package georgiaLibrary.georgia.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import georgiaLibrary.georgia.entity.BookEntity;

@Repository
	public interface BookRepository extends JpaRepository <BookEntity,Integer>{
	
	}

