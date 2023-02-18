package ch12;

public class Employee {
    private static int serialNumber = 1000;
    private int empId;
    private String empName;
    private String empDepartment;

    public Employee() {
        serialNumber++;
        empId = serialNumber;
    }

    public static int getSerialNumber() {
        int i = 0; // 지역변수는 상관 없음
//        empName = "Lee"; 이렇게 사용할 수 없다. 메모리 상에 문제 이기 때문에
        return serialNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
}
