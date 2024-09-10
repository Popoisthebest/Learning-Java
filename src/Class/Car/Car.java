package Class.Car;

public class Car {
    public double speed; // 현재 속도
    public String color; // 자동차 색상
    public static double MAX_SPEED = 200; // 차의 엔진이 허용하는 최대 속력(상수)

    public Car() {
        speed = 0;
        color = "";
    }

    public Car(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean speedUp(double speed) {
        if (speed < 0 || speed > MAX_SPEED) {
            this.speed = speed;
            return false;
        } else {
            this.speed += speed;
            return true;
        }

    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }
}
