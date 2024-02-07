package az.Developia.bookshopping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping(path="/books/new")
	public String OpenNewBookPage(Model model){
		Book book=new Book();
		model.addAttribute("book", book);
		return "new-book";
	}
	
	@PostMapping(path="/books/new-book-process")
	public String saveBook(@ModelAttribute(name="book")Book book,Model model) {
		book.setImage("book.jpg");
		book.setUsername("dea");
		bookDAO.save(book);
		List<Book> books=bookDAO.findAll();
		model.addAttribute("books", books);
		return "books";
		
	}
	@GetMapping(path="/books/delete/{id}")
	public String deleteBook(@PathVariable(name="id")Integer id,Model model){
		System.out.println(id);
		return "books";
	}

}
