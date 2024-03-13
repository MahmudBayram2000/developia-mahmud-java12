package georgiaLibrary.georgia.response;

import java.time.LocalDateTime;

import java.util.List;
import georgiaLibrary.georgia.entity.StudentEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseModel {
@SuppressWarnings("unused")
private List<StudentEntity> students;
@SuppressWarnings("unused")
private LocalDateTime now;
}