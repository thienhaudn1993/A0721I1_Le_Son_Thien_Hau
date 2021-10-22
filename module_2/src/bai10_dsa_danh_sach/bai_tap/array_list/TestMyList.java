package bai10_dsa_danh_sach.bai_tap.array_list;

public class TestMyList {
    public class Student{
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
        Student a = new Student(1,"Hau");
        Student b = new Student(2,"Hau2");
        Student c = new Student(3,"Hau3");
        Student d = new Student(4,"Hau4");
        Student e = new Student(5,"Hau5");
        MyList<Student> studentMyList = new MyList<>();
    }
}
