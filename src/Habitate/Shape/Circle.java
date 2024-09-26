package Habitate.Shape;

public class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "도형의 종류: 원, " + "둘레: " + perimeter() + ", 넓이: " + area();
    }
}
