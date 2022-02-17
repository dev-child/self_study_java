package Chap06.sec03.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println(car1.model);

        Car car2 = new Car("자가용");
        System.out.println(car2.model);

        Car car4 = new Car("택시","검정",200);
        System.out.println(car4.maxSpeed);

    }
}
