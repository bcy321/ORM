package ch05.ormReview;

public class ReviewTest {
    public static void main(String[] args) {
        Person tomas = new Person(12345,75,174,20,"남성","tomas");
        tomas.showPersonInfo();
        System.out.println("//////////////////////////////////////////////////");
        Order firstOrder = new Order(12345,"01012341234","대구시 수성구","13400","0030");
        firstOrder.showOrderDetail();
    }
}
