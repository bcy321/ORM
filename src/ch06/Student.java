package ch06;

public class Student {
    int studentId;
    String studentName;
    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
    }
}
