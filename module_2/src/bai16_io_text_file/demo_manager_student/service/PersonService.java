package demo_manager_student.service;

import demo_manager_student.model.Person;
import demo_manager_student.model.Student;
import demo_manager_student.model.Teacher;

import java.util.Scanner;

public class PersonService  implements IService{
    private Scanner scanner = new Scanner(System.in);
    public static Person[] personList = new Person[100];
    static {
        personList[0]=new Student(1,"chanh1",23,"DN",5,"Toán");
        personList[1]=new Student(2,"chanh2",23,"DN",5,"Toán");
        personList[2]=new Student(3,"chanh3",23,"DN",5,"Toán");
        personList[3]=new Teacher(4,"chanh4",23,"DN",2000);
        personList[4]=new Teacher(5,"chanh5",23,"DN",2000);
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {
        System.out.println("hiên thi ra danh sách");
        for (Person person: personList) {
            if (person !=null){
                if (person instanceof Student){
                    System.out.println(person.toString());
//                    ((Student)person).study();
                }else if (person instanceof Teacher){
                    System.out.println(person.toString());
                    ((Teacher)person).teach();
                }

            }else {
                break;
            }
        }
    }

    @Override
    public void delete() {

    }

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.display();
    }
}
