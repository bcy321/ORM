package ch10Homework;

public class Person {
    private int personId;
    private String name;
    private int money;

    public Person(int personId, String name, int money) {
        this.personId = personId;
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        final int MONEY = 10000;
        taxi.take(MONEY);
        this.money-=MONEY;
    }

    public void showPersonInfo(){
        System.out.println(name + "씨의 남은 돈은" + money + "원 입니다.");
    }

}
