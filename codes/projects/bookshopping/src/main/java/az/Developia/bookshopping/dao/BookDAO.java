package az.Developia.bookshopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.Developia.bookshopping.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {
	
	public List<Book> findAllByUsername(String username);

}
