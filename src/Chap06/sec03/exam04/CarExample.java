package Chap06.sec03.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.model);

        Car car2 = new Car("자가용");
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);
    }
}
