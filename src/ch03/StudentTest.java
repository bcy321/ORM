package ch03;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 12345;
        student.studentName = "gildong";
        student.address = "대구광역시 수성구";
        student.showStudentInformation();

        Student student1 = new Student();
        student1.studentId = 23456;
        student1.studentName = "test";
        student1.address = "서울특별시 강남구";
        student1.showStudentInformation();

        //힙메모리에 할당 된다.
        //ch03.Student@1b6d3586
        //ch03.Student@4554617c

        System.out.println(student);
        System.out.println(student1);

        // 객체 : 객체 지향 프로그램의 대상 생성된 인스턴스
        // 클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
        // 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
        // 멤버 변수 : 클래스의 속성, 특성
        // 메서드 : 멤버 변수를 이용하여 클래스의 기본 기능을 구현한 함수
        // 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
        // 참조 값 : 생성된 인스턴스의 메모리의 주소 값
    }
}
