package ch13_SingleTon;

import java.util.Objects;

public class CarFactory {
    private String factoryId;
    private String factoryName;
    private static CarFactory carFactory = new CarFactory(null, null);

    private CarFactory(String factoryId, String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }

    public static CarFactory getInstance(String factoryId, String factoryName){
        if(factoryId == "" || factoryId == null || factoryName == "" || factoryName == null ){
            System.out.println("공장 아이디 또는 이름이 존재하지 않습니다.");
            return null;
        }
        if(Objects.isNull(carFactory)) {
            carFactory = new CarFactory(null, null);
        }
        return carFactory;
    }

    public Car createCar(String carName, String carPrice, Person personName){

        Car car = new Car(carName, carPrice, personName);
        return car;
    }
}
