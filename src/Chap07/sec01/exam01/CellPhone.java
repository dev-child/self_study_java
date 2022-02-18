package Chap07.sec01.exam01;

public class CellPhone {
    String model;
    String color;


    void powerOn() {
        System.out.println("전원 on");
    }
    void powerOff() {
        System.out.println("전원 off");
    }
    void bell() {
        System.out.println("벨 울림");
    }
    void sendVoice(String message) {
        System.out.println("자신 : " + message);
    }
    void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }
    void hangUp() {
        System.out.println("전화를 끔");
    }

}
