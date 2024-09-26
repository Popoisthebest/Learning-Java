package Habitate.Shape;

public class Triangle extends Shape {
    double side;
    
    Triangle(double side){
        this.side = side;
    }
    
    @Override
    double area() {
        return side / 2 * Math.sqrt(3) * side / 2;
    }
    
    @Override
    double perimeter() {
        return side * 3;
    }
    
    public String toString() {
        return "도형의 종류: 삼각형, " + "둘레: " + perimeter() + ", 넓이: " + area();
    }
}
