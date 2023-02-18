package ch11;

public class Employee {

    public static int serialNumber = 1000;

    private int employeeId;
    private String empName;
    private String empDepartment;

    public Employee() {
        serialNumber++;
        employeeId = serialNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
