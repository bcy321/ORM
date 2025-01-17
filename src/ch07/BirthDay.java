package ch07;

public class BirthDay {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        isValid = (month > 0 && month < 13);
        if (isValid){
            this.month = month;
            return;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate(){
        if (isValid){
            System.out.println(year + "년" + month + "월" + day + "일");
            return;
        }
        System.out.println("유효하지 않은 날짜 입니다.");
    }
}
