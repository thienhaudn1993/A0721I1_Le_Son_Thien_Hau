package case_study_furama_resort.models;

public class Employee extends People {
    private String levelGrade;
    private String jobPosition;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, String gender, String cmnd, int phone, String email, String levelGrade, String jobPosition, double salary) {
        super(id, name, age, gender, cmnd, phone, email);
        this.levelGrade = levelGrade;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getLevelGrade() {
        return levelGrade;
    }

    public void setLevelGrade(String levelGrade) {
        this.levelGrade = levelGrade;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "levelGrade='" + levelGrade + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
