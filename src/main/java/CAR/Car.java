package CAR;

public class Car {
    private String carNumber, carColor;
   private int carPeople;

    public String getCarNumber() {
        return carNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarPeople() {
        return carPeople;
    }

    public Car(String carNumber, String carColor, int carPeople) {
        this.carNumber = carNumber;
        this.carColor = carColor;
        this.carPeople = carPeople;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car={" +
                "carNumber='" + carNumber + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPeople=" + carPeople +
                '}';
    }

    public Car(String carNumber, String carColor) {
        this.carNumber = carNumber;
        this.carColor = carColor;
        this.carPeople =4;
    }

//    public Car() {
//        this.carNumber = "BB0003BB";
//        this.carColor = "Yelow";
//        this.carPeople =4;
//    }
}

