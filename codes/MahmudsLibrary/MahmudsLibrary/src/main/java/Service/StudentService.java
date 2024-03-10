package Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import DAO.StudentDAO;
import Entity.StudentEntity;
import Exception.OurRunTimeException;

@Service
public class StudentService {
	
	private StudentEntity student;
	@Autowired
	private StudentDAO studentDAO;

	public void add(StudentEntity s, BindingResult br) {

		if (br.hasErrors()) {
			throw new OurRunTimeException("Melumatlarin tamligi pozulub", br);

		}
		s.setId(s.getId());
		s.setName(s.getName());
		s.setSurname(s.getSurname());
		studentDAO.save(s);
	}

	public void update(StudentEntity s) {
		Optional<StudentEntity> studentOptional =studentDAO.findById(s.getId());
		boolean studentExists = studentOptional.isPresent();
		StudentEntity s1 = null;
		if (studentExists) {
			s1 = studentOptional.get();
			s1.setId(s.getId());
			s1.setName(s.getName());
			s1.setSurname(s.getSurname());
			studentDAO.save(s1);
		} else {
			throw new OurRunTimeException("sagird tapilmadi", null);
		}

}
	
	public String DeleteStudent(Integer id) {
		studentDAO.deleteById(id);
		
		return "delete" + id;
	}
	
}
