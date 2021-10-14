package bai6_ke_thua.demo_bai_hoc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Student student =new Student(1,"chanh","DN");
//        student.setSubject("Toán");
//        student.goToBy();
//        System.out.println(student.toString());
//        student.goToBy();
//        student.study();
//        student.registerSubject();
//        student.registerSubject("Toan");
//        student.registerSubject("Hóa");

//        Teacher teacher = new Teacher(2,"hai","QN",200);
//        teacher.goToBy();
//        teacher.teach();
//        Employee employee = new Employee(3,"hà","QT",200);
//        employee.goToBy();

//        Student student1 = new Student();
        // + Student : kiểu dữ liêu khai báo
        // + sutdent1: biến tham chiếu
        // +new Student(): đối tượng

//        System.out.println(student1 instanceof Student);
    // true
//        System.out.println(student1 instanceof Person);
    // true

        // ep kiểu tường mình
        Person student = new Student();// ép kiểu ngậm định ( đang ép con lên cha)
        // student : có các kiểu dữ liệu nào?
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);

        // student có thể gọi nhưng phương thức nào??????????????????????????
        // chỉ có thể gọi pt của Person muốn có các pt của Student thì cần phải ép kiểu
       /* if (student instanceof Student){
            ((Student)student).study(); //ep kiể tường minh cha về con
        }*/
        // student gọi pt gotoBy() của Person hay của Student????????????
//        student.goToBy();// đang code gọi cha (Person);
        // khi chạy lên thì sẽ gọi thằng con (Student). // do cơ chế dynamic binding

        // Ép kiểu không phù hợp
//        Person person = new Person();
//        System.out.println(person instanceof Student); // false
//        ((Student)person).study(); // ep kiểu không phù hợp


    }
}
