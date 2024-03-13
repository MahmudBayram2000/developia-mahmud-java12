package georgiaLibrary.georgia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import georgiaLibrary.georgia.entity.StudentEntity;
import georgiaLibrary.georgia.exception.OurRunTimeException;
import georgiaLibrary.georgia.repository.StudentRepository;


@Service
public class StudentService {
	
	@SuppressWarnings("unused")
	private StudentEntity student;
	@Autowired
	private StudentRepository studentRepository;

	public void add(StudentEntity s, BindingResult br) {

		if (br.hasErrors()) {
			throw new OurRunTimeException("Melumatlarin tamligi pozulub", br);

		}
		s.setId(s.getId());
		s.setName(s.getName());
		s.setSurname(s.getSurname());
		studentRepository.save(s);
	}

	public void update(StudentEntity s) {
		Optional<StudentEntity> studentOptional =studentRepository.findById(s.getId());
		boolean studentExists = studentOptional.isPresent();
		StudentEntity s1 = null;
		if (studentExists) {
			s1 = studentOptional.get();
			s1.setId(s.getId());
			s1.setName(s.getName());
			s1.setSurname(s.getSurname());
			studentRepository.save(s1);
		} else {
			throw new OurRunTimeException("sagird tapilmadi", null);
		}

}
	
	public String DeleteStudent(Integer id) {
		studentRepository.deleteById(id);
		
		return "delete" + id;
	}
	
}