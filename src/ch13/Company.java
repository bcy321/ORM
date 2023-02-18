package ch13;
// 회사라는 객체는 한 개만 있어야 한다.
// 하나의 인스턴스를 만들 필요성이 있다.
public class Company {
    private static Company instance = new Company();

    private Company(){

    }

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }

}
