package az.Developia.bookshopping.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.Developia.bookshopping.dao.BookDAO;

@RestController
@RequestMapping(path="/books")
public class BookRestController {
	
	@Autowired
	private BookDAO bookDAO;

	@GetMapping
	public List<Book> findAll(){
		return bookDAO.findAll();
		
	}
	}

