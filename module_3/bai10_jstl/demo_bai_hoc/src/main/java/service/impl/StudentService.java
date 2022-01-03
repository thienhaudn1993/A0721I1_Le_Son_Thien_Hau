package service.impl;

import model.Student;
import reponsitory.IStudentRepositpry;
import reponsitory.impl.StudentRepository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepositpry iStudentRepositpry = new StudentRepository();
    @Override
    public List<Student> findAll() {
        return iStudentRepositpry.findAll();
    }

    @Override
    public Student findById(String id) {
        return iStudentRepositpry.findById(id);
    }

    @Override
    public void save(String id, String name, String grade) {
        if(!name.matches("^[A-Za-z ]{4,}$")) {

        }
        iStudentRepositpry.save(id, name, grade);
    }

    @Override
    public boolean createStudent(Student student) {
        Student student1 = findById(student.getId().toString());
        if (student1 != null) {
            return false;
        } else {
            iStudentRepositpry.createStudent(student);
            return true;
        }
    }

    @Override
    public boolean remove(Student student) {
        Student student1 = findById(student.getId().toString());
        if (student1 == null) {
            return false;
        }
        else {
            iStudentRepositpry.remove(student);
            return true;
        }
    }
}
