package Chap06.sec04.exam01;

public class Calculator {

    /*메소드*/
    void powerOn() {
        System.out.println("전원 시작");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        return (double) x / (double) y;
    }

    void powerOff() {
        System.out.println("전원 끔");
    }
}
