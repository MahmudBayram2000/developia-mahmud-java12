package az.Developia.bookshopping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.Developia.bookshopping.dao.BookDAO;
import az.Developia.bookshopping.model.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookDAO bookDAO;
	
	@GetMapping(path="/books")
	public String ShowBooks(Model model) {
		List<Book> books=bookDAO.findAll();
		model.addAttribute("books", books);
		return "books";
	}

}
