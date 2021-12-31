package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();


    Student findById(String id);
}
