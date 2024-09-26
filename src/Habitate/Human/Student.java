package Habitate.Human;

public class Student extends Human {
    String major;
    
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getMajor() {
        return major;
    }
    
    public String toString() {
        return super.toString() + ", 전공: " + major;
    }
}
