package az.Developia.bookshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.Developia.bookshopping.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {

}
