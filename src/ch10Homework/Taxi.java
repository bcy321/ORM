package ch10Homework;

public class Taxi {
    int money;
    String companyName;

    public Taxi(String companyName) {
        this.companyName = companyName;
    }

    public void take(int money){
        this.money += money;
    }

    public void showTaxiInfo(){
        System.out.println(companyName + "택시 회사의 수입은" + money);
    }


}
