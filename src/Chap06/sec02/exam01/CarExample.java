package Chap06.sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        /*객체생성*/
        Car myCar = new Car();

        /*필드값 읽기*/
        System.out.println("제작회사 : " + myCar.company);

        /*필드값 변경*/
        System.out.println("속도 : " + myCar.speed);
        myCar.speed = 60;
        System.out.println("속도 : " + myCar.speed);
    }
}
