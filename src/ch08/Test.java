package ch08;
//캡슐화
/*
* 꼭 필요한 정보와 기능만 외부에 오픈함
* 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현 하게 된다.
* 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 한다.
* */
public class Test {
    public static void main(String[] args) {
        MakeReport mr = new MakeReport();
        System.out.println(mr.getReport());
    }
}
