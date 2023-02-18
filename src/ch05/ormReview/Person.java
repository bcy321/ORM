package ch05.ormReview;

public class Person {
    int personId;
    int weight;
    int height;
    int age;
    String gender;
    String name;

    public Person(int personId, int weight, int height, int age, String gender, String name) {
        this.personId = personId;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void showPersonInfo(){
        System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "킬로인 "+ gender + "이 있습니다.");
        System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다" );
    }
}
