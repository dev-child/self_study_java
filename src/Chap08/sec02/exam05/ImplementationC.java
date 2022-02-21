package Chap08.sec02.exam05;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("A 실행");
    }

    @Override
    public void methodB() {
        System.out.println("B 실행");
    }

    @Override
    public void methodC() {
        System.out.println("C 실행");
    }
}
