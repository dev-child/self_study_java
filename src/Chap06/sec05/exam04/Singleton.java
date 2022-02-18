package Chap06.sec05.exam04;

public class Singleton {

    /*정적 필드*/
//    private static 클래스 singleton = new 클래스();
    private static Singleton singleton = new Singleton();

    /*생성자*/
//    private 클래스() {}
    private Singleton() {}

    /*정적 메소드*/
//    static 클래스 getInstance() {
//        return singleton;
//    }
    static Singleton getInstance() {
        return singleton;
    }
}
