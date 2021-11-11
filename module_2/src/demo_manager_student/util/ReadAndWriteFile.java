package demo_manager_student.util;

import demo_manager_student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    final static String STUDENT_PATH = "src/demo_manager_student/data/student.csv";
    public static void writeStudentListToCSV(List<Student> studentList,boolean append){
        File file = new File(STUDENT_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append); // true: ghi tiếp ==> false: ghi đè
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student:studentList) {
                bufferedWriter.write(student.getInfoToCSV());
                bufferedWriter.newLine();// xuống hàng
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");;
        }
    }
    public static List<Student> readStudentListFromCSV(){
        List<Student> studentList = new ArrayList<>();
        File file = new File(STUDENT_PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.readLine(); => đọc ra một dòng trong file => trả về text
            String line = null;
            String[] array = null;
            while ((line=bufferedReader.readLine())!=null){
                array = line.split(",");
                Student student = new Student(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]), array[5]);
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");;
        }
        return studentList;
    }
}
