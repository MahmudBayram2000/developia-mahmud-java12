package DAO.GeorgiaLibrary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.GeorgiaLibrary.BookEntity;

@Repository
	public interface BookDAO extends JpaRepository <BookEntity,Integer>{
	
	}


