package Chap07.sec01.exam04;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane su = new SupersonicAirplane();
        su.fly();
        su.flyMode = SupersonicAirplane.NORMAL;
        su.fly();
        su.flyMode = SupersonicAirplane.SUPERSONIC;
        su.fly();
    }
}
