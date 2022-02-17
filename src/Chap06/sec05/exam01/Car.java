package Chap06.sec05.exam01;

public class Car {
    /*필드*/
    String model;
    int speed;

    /*생성자*/
    Car(String model) {
        this.model = model;
        System.out.println("set : " + this.model);
    }

    /*메소드*/
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model + "달림." + " 시속 : " + this.speed);
        }
    }
}
