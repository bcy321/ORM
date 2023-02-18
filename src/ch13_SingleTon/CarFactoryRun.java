package ch13_SingleTon;

public class CarFactoryRun {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance("1234", "A공장");
        Person p1 = new Person("홍길동");
        Person p2 = new Person("김철수");

        assert factory != null;
        Car sonata = factory.createCar("sonata", "2500$", p1);
        Car tusan = factory.createCar("tusan", "2700$",p2);

        System.out.println(p1.getPersonName()+" "+sonata.getCarId() + " " + sonata.getCarName() + " " + sonata.getCarPrice());
        System.out.println(p2.getPersonName()+" "+ tusan.getCarId() + " " + tusan.getCarName() + " " + tusan.getCarPrice());


    }
}
