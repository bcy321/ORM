package ch13;

import java.util.Calendar;

/*
* 싱글톤 패턴이란
* 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
* static 변수, 메서드 활용하여 구현 할 수 있음
* */
public class SingleTonTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
