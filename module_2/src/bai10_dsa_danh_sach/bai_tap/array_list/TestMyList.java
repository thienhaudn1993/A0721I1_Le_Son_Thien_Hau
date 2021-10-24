package bai10_dsa_danh_sach.bai_tap.array_list;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student a = new Student(1,"Hau1");
        Student b = new Student(2,"Hau2");
        Student c = new Student(3,"Hau3");
        Student d = new Student(4,"Hau4");
        Student e = new Student(5,"Hau5");
        Student f = new Student(7,"Hau7");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f,2);
        System.out.println("Size: " + studentMyArrayList.size());
//        studentMyList.clean();
        /**
         * Dùng vòng lặp này khi chưa tạo phương thức get()
         */
        /*for (int i = 0; i < studentMyArrayList.size() ; i++) {
            Student student= (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }*/
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            System.out.println(studentMyArrayList.get(i).getId());
            System.out.println(studentMyArrayList.get(i).getName());
        }
        System.out.println("indexOf:");
//        System.out.println(studentMyArrayList.indexOf(f));
//        System.out.println(studentMyArrayList.contains(f));
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(2);
        for (int i = 0; i < newMyArrayList.size() ; i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
