package reponsitory.impl;

import model.Student;
import reponsitory.IStudentRepositpry;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepositpry {
//    private static List<Student> studentList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            /*Statement statement = this.baserepository.getConnection().createStatement();
            statement.executeQuery("select * from student");*/
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from student");
            //executeQuery : select
            //executeUpdate: insert, update, delete.
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student;
            while (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGrade(resultSet.getDouble("grade"));
                student.setGender(resultSet.getInt("gender"));
                student.setDateOfBirthday(resultSet.getString("date_of_birth"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList  ;
    }

    @Override
    public Student findById(String id) {
//        Integer temp = Integer.parseInt(id);
//        for (Student student: studentList) {
//            if (student.getId().equals(temp)) {
//                return student;
//            }
//        }
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from student where id=?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student = null;
            while (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGrade(resultSet.getDouble("grade"));
                student.setGender(resultSet.getInt("gender"));
                student.setDateOfBirthday(resultSet.getString("date_of_birth"));
                break;
            }
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void save(String id, String name, String grade) {
//        Integer temp = Integer.parseInt(id);
//        for (Student student: studentList) {
//            if (student.getId().equals(temp)) {
//                student.setName(name);
//                student.setGrade(Double.valueOf(grade));
//            }
//        }
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update student set name =?, grade = ? where id= ?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, grade);
            preparedStatement.setString(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createStudent(Student student) {
//        studentList.add(student);
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into student (name,date_of_birth,gender,grade) values(?,?,?,?)");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getDateOfBirthday());
            preparedStatement.setInt(3, student.getGender());
            preparedStatement.setDouble(4, student.getGrade());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Student student) {
//        studentList.remove(student);
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("delete from student where id = ?");
            preparedStatement.setInt(1,student.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
