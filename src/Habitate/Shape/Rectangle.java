package Habitate.Shape;

public class Rectangle extends Shape {
    double width;
    double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double area() {
        return width * height;
    }
    
    @Override
    double perimeter() {
        return 2 * width + 2 * height;
    }
    
    public String toString() {
        return "도형의 종류: 사각형, " + "둘레: " + perimeter() + ", 넓이: " + area();
    }
}
