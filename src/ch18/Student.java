package ch18;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectArrayList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectArrayList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score){
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(score);
        subjectArrayList.add(subject);
    }

    public void showInfo(){
        int total = 0;
        for(Subject subject : subjectArrayList){
            total+=subject.getSubjectScore();
            System.out.println(studentName + "학생의 " + subject.getSubjectName() + "과목의 성적은 " + subject.getSubjectScore());
        }
        System.out.println(studentName +"님의 총점은 " + total + "입니다.");
    }
}
