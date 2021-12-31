package reponsitory;

import model.Student;

import java.util.List;

public interface IStudentRepositpry {
    List<Student> findAll();

    Student findById(String id);
}
