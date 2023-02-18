package ch10Upgrade;

public class TakeTransTest {
    public static void main(String[] args) {
        Student jams = new Student("jams", 5000);
        Student tomas = new Student("tomas", 5000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        jams.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        tomas.takeSubway(greenSubway);

        jams.showInfo();
        tomas.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        greenSubway.showBusInfo();


    }
}
