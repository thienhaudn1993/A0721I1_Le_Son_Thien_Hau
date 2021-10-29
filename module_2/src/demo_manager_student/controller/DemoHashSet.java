package demo_manager_student.controller;

import demo_manager_student.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoHashSet {
    public static void main(String[] args) {
        TreeSet<Student> studentHashSet = new TreeSet<>();
        studentHashSet.add(new Student("hau1",28,7,"DN",9,"Toán"));
        studentHashSet.add(new Student("hau2",22,2,"DN",9,"Toán"));
        studentHashSet.add(new Student("hau4",21,4,"DN",9,"Toán"));
        studentHashSet.add(new Student("hau5",28,5,"DN",9,"Toán"));
        studentHashSet.add(new Student("hau7",19,3,"DN",9,"Toán"));
        studentHashSet.add(new Student("hau1",24,1,"DN",9,"Toán"));

        for (Student student: studentHashSet) {
            System.out.println(student +"- "+student.hashCode()); //hashcode: mã băm
        }
    }
}
