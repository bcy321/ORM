package ch03;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInformation(){
        System.out.println(
                studentId
                + "학번의 학생의 이름은"
                + studentName
                + "이고, 주소는"
                + address
                + "입니다."

        );
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
