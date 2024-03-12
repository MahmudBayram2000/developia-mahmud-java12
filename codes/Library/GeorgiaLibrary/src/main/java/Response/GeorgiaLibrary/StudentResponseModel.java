package Response.GeorgiaLibrary;

import java.time.LocalDateTime;
import java.util.List;
import DAO.GeorgiaLibrary.StudentDAO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseModel {
@SuppressWarnings("unused")
private List<StudentDAO> students;
@SuppressWarnings("unused")
private LocalDateTime now;
}