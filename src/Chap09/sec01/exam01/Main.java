package Chap09.sec01.exam01;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
        b.field1 = 3;
        b.method1();
    }
}
