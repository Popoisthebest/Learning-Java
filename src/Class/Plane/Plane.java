package Class.Plane;

public class Plane {
    public String manufacturer; // 제작사
    public String model; // 비행기 모델명
    public int maxNumberOfPassengers; // 최대 승객수
    public static int numberOfPlanes; // 지금까지 생성된 비행기 객체의 수

    public Plane() {
        manufacturer = "";
        model = "";
        maxNumberOfPassengers = 0;
        numberOfPlanes++;
    }

    public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        numberOfPlanes++;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        if (maxNumberOfPassengers < 0) {
            this.maxNumberOfPassengers = 0;
        } else {
            this.maxNumberOfPassengers = maxNumberOfPassengers;
        }
    }

    public static int getNumberOfPlanes() {
        return numberOfPlanes;
    }
}
