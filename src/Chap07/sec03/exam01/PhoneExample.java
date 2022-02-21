package Chap07.sec03.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길등");

//        smartPhone.owner = "도정관";
        System.out.println(smartPhone.owner);
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
