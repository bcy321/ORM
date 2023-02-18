package ch13_SingleTon;

public class Car {
    private static int carSerialNumber = 1000;
    private  int carId;
    private String carName;
    private String carPrice;
//    private Person p1;

    public Car(String carName, String carPrice, Person orderPerson) {
        carSerialNumber++;
        orderPerson.setPersonName(orderPerson.getPersonName());
        this.carId = carSerialNumber;
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }
}
