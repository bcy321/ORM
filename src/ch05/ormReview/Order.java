package ch05.ormReview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    int orderId;
    String phone;
    String address;
    String price;
    String menuId;

    public Order(int orderId, String phone, String address, String price, String menuId) {
        this.orderId = orderId;
        this.phone = phone;
        this.address = address;
        this.price = price;
        this.menuId = menuId;
    }

    public void showOrderDetail() {
        Date date = new Date();
        SimpleDateFormat calendar = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeClock = new SimpleDateFormat("HH:mm:ss");
        System.out.println("주문 접수 번호: " + orderId);
        System.out.println("주문 핸드폰 번호: " + phone);
        System.out.println("주문 집 주소: " + address);
        System.out.println("주문 날짜: " + calendar.format(date));
        System.out.println("주문 시간: " + timeClock.format(date));
        System.out.println("주문 가격: " + price);
        System.out.println("메뉴 번호: " + menuId);
    }
}
