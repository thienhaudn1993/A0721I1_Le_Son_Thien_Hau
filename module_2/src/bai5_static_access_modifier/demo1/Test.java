package bai5_static_access_modifier.demo1;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1,"chanh1","DN");
        System.out.println("đây là hàm main");
        Student student2 = new Student(1,"chanh2","DN");
        Student student3 = new Student(1,"chanh3","DN");
        Student student4 = new Student(1,"chanh4","DN");
        Student student5 = new Student(1,"chanh5","DN");
        Student[] studentList = new Student[5];
        studentList[0]=student1;
        studentList[1]=student2;
        studentList[2]=student3;
        studentList[3]=student4;
        studentList[4]=student5;
        // truy cập vào thuộc tính thông qua class
        /*Student.school="CodeGym";*/

        /* truy cập thuộc tính thông qua đối tượng, nếu biến school1 ko đế static ta sẽ thấy nó sẽ không được thêm hết vào đối tượng sau,
         còn school1 đổi qua biến static nó sẽ được thêm vào hàng loạt các đối tượng khác*/
        student1.school1="CodeGym1";
        System.out.println(student1.name+" -Cách đối tượng- "+student1.school1);
        System.out.println(student2.name+" -Cách đối tượng- "+student2.school1);
        System.out.println(student3.name+" -Cách đối tượng- "+student3.school1);
        System.out.println(student4.name+" -Cách đối tượng- "+student4.school1);
        System.out.println(student5.name+" -Cách đối tượng- "+student5.school1);
        /*for (int i=0; i<studentList.length; i++){
            studentList[i].school="CodeGym";
        }*/

        for (Student s: studentList) {
            System.out.println(s.name+ " -Cách thông qua class- "+ s.school);
        }
        // truy cập vào pt static thông qua class
        Student.registerSubject();
        // truy cập pt static thông qua đối tượng
        student1.registerSubject();
        // không thể truy cập vào thuộc tính private ở bên ngoài class
    }
}
