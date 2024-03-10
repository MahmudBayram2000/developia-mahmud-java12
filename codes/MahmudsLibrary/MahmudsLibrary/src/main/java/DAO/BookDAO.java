package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.BookEntity;

@Repository
	public interface BookDAO extends JpaRepository <BookEntity,Integer>{
	
	}


