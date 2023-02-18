package ch10Homework;

public class TakeTaxiTest {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Jams", 50000);
        Person p2 = new Person(2, "Tomas", 30000);

        Taxi t1 = new Taxi("잘 나간다");
        p1.takeTaxi(t1);
        p2.takeTaxi(t1);
        p1.showPersonInfo();
        t1.showTaxiInfo();
    }
}
