package demo_manager_student.util;

import demo_manager_student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFileNew {
    final static String STUDENT_PATH = "src/demo_manager_student/data/student.csv";
    public static void writeStudentListToCSV(List<Student> studentList, boolean append) {
        File file = new File(STUDENT_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static List<Student> readStudentListfromCSV() {
            List<Student> studentList = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(new File(STUDENT_PATH));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                String[] array = null;
                while ((line = bufferedReader.readLine()) != null) {
                    array = line.split(",");
                    Student student = new Student(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), array[3], Double.parseDouble(array[4]), array[5]);
                    studentList.add(student);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return studentList;
        }
    }
