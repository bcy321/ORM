package ch18;

public class ScoreCalcTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "lee");
        student1.addSubject("국어", 100);
        student1.addSubject("수학", 70);

        Student student2 = new Student(1002,"Kim");
        student2.addSubject("국어", 30);
        student2.addSubject("수학", 40);
        student2.addSubject("영어", 50);

        student1.showInfo();
        System.out.println("//////////////////////////////////");
        student2.showInfo();

    }
}
