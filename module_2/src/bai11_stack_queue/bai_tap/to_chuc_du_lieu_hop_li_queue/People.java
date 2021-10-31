package bai11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_queue;

public class People implements Comparable<People> {
    private String gender;
    private String name;
    private String birthday;
    private int age;

    public People() {
    }

    public People(String gender, String name, String birthday, int age) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if (this.getGender().compareTo(o.getGender())==0){
            return this.getAge()-o.getAge();
        }
        return this.getGender().compareTo(o.getGender());
    }
}
