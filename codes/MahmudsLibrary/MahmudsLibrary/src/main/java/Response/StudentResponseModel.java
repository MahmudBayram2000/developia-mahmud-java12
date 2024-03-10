package Response;

import java.time.LocalDateTime;
import java.util.List;

import DAO.StudentDAO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseModel {
private List<StudentDAO> students;
private LocalDateTime now;
}