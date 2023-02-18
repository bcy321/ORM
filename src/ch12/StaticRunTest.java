package ch12;

/*
* static
* 인스턴스가 생성될 때 만들어지는 변수가 아닌 처음 프로그래밍 메모리에 로딩될 때 메모리에 할당
* 클래스 변수, 정적 변수라고도 함
* 인스턴스 생성과 상관없이 사용가능하므로 클래스 이름으로 직접 참조
* */
public class StaticRunTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("이순신");

        Employee emp2 = new Employee();
        emp2.setEmpName("김유신");
        System.out.println(emp1.getEmpName() + "님의 사번은 " + Employee.getSerialNumber() + "입니다.");
        System.out.println(emp2.getEmpName() + "님의 사번은 " + Employee.getSerialNumber() + "입니다.");
    }
}
