package az.Developia.bookshopping.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import az.Developia.bookshopping.config.MySession;
import az.Developia.bookshopping.dao.BookDAO;
import az.Developia.bookshopping.model.Book;

@Controller
public class CustomerController {
	
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private MySession mySession;
	
	@GetMapping(path="/customer")
	public String ShowCustomerPage(Model model) {
		List<Book> books=bookDAO.findAll();
        model.addAttribute("books", books);
        System.out.println(mySession.getUsername());
		return "customer";
	}
	
}