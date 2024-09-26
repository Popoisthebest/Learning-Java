package Habitate.Human;

public class Human {
    String name;
    int age;
    
    public Human() {
    
    }
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

