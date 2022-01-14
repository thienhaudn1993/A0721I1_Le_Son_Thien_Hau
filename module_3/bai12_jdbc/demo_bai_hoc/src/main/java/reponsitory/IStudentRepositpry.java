package reponsitory;

import model.Student;

import java.util.List;

public interface IStudentRepositpry {
    List<Student> findAll();

    Student findById(String id);

    void save(String id, String name, String grade);

    void createStudent(Student student);

    void remove(Student student);
}
