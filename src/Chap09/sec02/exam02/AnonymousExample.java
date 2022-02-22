package Chap09.sec02.exam02;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        /*익명 객체 필드 사용*/
        anonymous.field.turnOn();

        /*익명 객체 로컬 변수 사용*/
        anonymous.method1();

        /*익명 객체 매개값 사용*/
        anonymous.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("스마트 티비를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("스마트 티비를 끕니다.");
                    }
                }
        );
    }
}
