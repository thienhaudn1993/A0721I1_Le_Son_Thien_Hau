package reponsitory.impl;

import model.Student;
import reponsitory.IStudentRepositpry;
import service.impl.BaseRepository;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepositpry {
    private static List<Student> studentList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
  /*  static {
        studentList.add(new Student(1,"Hau","15-06-1993",1,3.0));
        studentList.add(new Student(2,"Phuong","11-12-1996",0,9.5));
    }*/

    @Override
    public List<Student> findAll() {
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return studentList;
        return null
    }

    @Override
    public Student findById(String id) {
        Integer temp = Integer.parseInt(id);
        for (Student student: studentList) {
            if (student.getId().equals(temp)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(String id, String name, String grade) {
        Integer temp = Integer.parseInt(id);
        for (Student student: studentList) {
            if (student.getId().equals(temp)) {
                student.setName(name);
                student.setGrade(Double.valueOf(grade));
            }
        }
    }

    @Override
    public void createStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void remove(Student student) {
        studentList.remove(student);
    }
}
