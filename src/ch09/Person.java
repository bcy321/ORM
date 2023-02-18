package ch09;
/*
 * this
 * 인스턴스 자신의 메모리를 가리킴
 * 생성자에서 또 다른 생성자를 호출 할때 사용
 * 사신의 주소를 반환함
 * */
public class Person {
    private String name;
    private int age;

    public Person() {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
    }

    public void showPerson(){
        System.out.println(name + " , " + age);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
        System.out.println(person);
        Person person2 = person.getPerson();
        System.out.println(person2);

    }
}
