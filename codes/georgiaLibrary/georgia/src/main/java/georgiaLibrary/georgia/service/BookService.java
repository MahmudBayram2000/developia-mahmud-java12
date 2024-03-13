package georgiaLibrary.georgia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import georgiaLibrary.georgia.entity.BookEntity;
import georgiaLibrary.georgia.exception.OurRunTimeException;
import georgiaLibrary.georgia.repository.BookRepository;



@Service
public class BookService {

	@SuppressWarnings("unused")
	private georgiaLibrary.georgia.entity.BookEntity book;
	@Autowired
	private BookRepository bookRepository;

	public void add(georgiaLibrary.georgia.entity.BookEntity b, BindingResult br) {

		if (br.hasErrors()) {
			throw new OurRunTimeException("Melumatlarin tamligi pozulub", br);

		}
		b.setId(b.getId());
		b.setName(b.getName());
		b.setRegister(b.getRegister());
		bookRepository.save(b);
	}

	public void update(BookEntity b) {
		Optional<BookEntity> bookOptional =bookRepository.findById(b.getId());
		boolean bookExists = bookOptional.isPresent();
		BookEntity b1 = null;
		if (bookExists) {
			b1 = bookOptional.get();
			b1.setId(b1.getId());
			b1.setName(b1.getName());
			b1.setRegister(b1.getRegister());
			bookRepository.save(b1);
		} else {
			throw new OurRunTimeException("Kitab tapilmadi", null);
		}
}
	
	public String DeleteBook(Integer id) {
		bookRepository.deleteById(id);
		return "deleted" + id;
	}
	
}
