package ch10;

public class Student {
    private String studentName;
    private int money;

    public Student(String studentName ,int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus, int cash) {
        bus.take(cash);
        money -= cash;
    }
    public void takeSubway(Subway subway) {
        subway.take(1500);
        money -= 1500;
    }
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }


}
