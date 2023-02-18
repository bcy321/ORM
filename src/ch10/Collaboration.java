package ch10;
/*
* collaboration
* 객체 지향 프로그래밍에서의 협력
* 객체 지향 프로그램에서 객체간에는 협력이 이루어짐
* 협력을 위해서는 필요한 메시지를 전송하고 이를 처리하는 기능이 구현되어야 함
* 매개변수로 객체가 전달되는 경우가 발생
* */
public class Collaboration {



    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomes", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100, 1000);
        james.showInfo();
        bus100.showInfo();

        Subway subway2 = new Subway(2);
        tomas.takeSubway(subway2);
        tomas.showInfo();
        subway2.showInfo();
    }

}
