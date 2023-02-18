package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(12345, "Gildong", 1); // 생성자 오버로딩
        Student s2 = new Student(); // 기본 생성자
//        s2.studentName = "TestStudent";
        System.out.println(s1.showStudentInfo());
        System.out.println(s2.showStudentInfo());
    }
}
