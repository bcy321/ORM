package ch06;

public class SubjectTest {
    public static void main(String[] args) {
        Student student01 = new Student(100, "Lee");
        student01.setKorea("국어", 100);
        student01.setMath("수학",99);

        Student student02 = new Student(200, "Kim");
        student02.setKorea("국어", 80);
        student02.setMath("수학",88);


        student01.showScoreInfo();
        student02.showScoreInfo();
    }
}
