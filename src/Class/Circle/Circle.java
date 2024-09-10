package Class.Circle;

public class Circle {
    double radius;
    double x;
    double y;

    // 반지름 setter 생성
    public void setRadius(double R) {
        radius = R;
    }

    // x좌표 setter 생성
    public void setX(double X) {
        x = X;
    }

    // y좌표 setter 생성
    public void setY(double Y) {
        y = Y;
    }

    // 반지름 getter 생성, 0보다 작은 값처럼 잘못된 값은 0으로 처리
    public double getRadius() {
        if (radius < 0) {
            return 0;
        } else {
            return radius;
        }
    }

    // x좌표 getter 생성
    public double getX() {
        return x;
    }

    // y좌표 getter 생성
    public double getY() {
        return y;
    }

    // 원의 넓이를 계산하는 getter 생성
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

