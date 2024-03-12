package Service.GeorgiaLibrary;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import DAO.GeorgiaLibrary.BookDAO;
import Entity.GeorgiaLibrary.BookEntity;
import Exception.GeorgiaLibrary.OurRunTimeException;


@Service
public class BookService {

	@SuppressWarnings("unused")
	private BookEntity book;
	@Autowired
	private BookDAO bookDAO;

	public void add(BookEntity b, BindingResult br) {

		if (br.hasErrors()) {
			throw new OurRunTimeException("Melumatlarin tamligi pozulub", br);

		}
		b.setId(b.getId());
		b.setName(b.getName());
		b.setRegister(b.getRegister());
		bookDAO.save(b);
	}

	public void update(BookEntity b) {
		Optional<BookEntity> bookOptional =bookDAO.findById(b.getId());
		boolean bookExists = bookOptional.isPresent();
		BookEntity b1 = null;
		if (bookExists) {
			b1 = bookOptional.get();
			b1.setId(b1.getId());
			b1.setName(b1.getName());
			b1.setRegister(b1.getRegister());
			bookDAO.save(b1);
		} else {
			throw new OurRunTimeException("Kitab tapilmadi", null);
		}
}
	
	public String DeleteBook(Integer id) {
		bookDAO.deleteById(id);
		return "deleted" + id;
	}
	
}