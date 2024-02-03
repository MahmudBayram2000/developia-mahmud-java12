package az.Developia.bookshopping.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.Developia.bookshopping.dao.BookDAO;
import az.Developia.bookshopping.model.Book;

@RestController
@RequestMapping(path="/books")
public class BookRestController {
	
	@Autowired
	private BookDAO bookDAO;

	@GetMapping
	public List<Book> findAll(){
		return bookDAO.findAll();
		
	}
	@GetMapping(path="/{id}")
	public List<Book> findById(@PathVariable(name="id") Integer id){
		return (List<Book>) bookDAO.findById(id).get();
	}
}

