package Chap08.sec02.exam05;

public class Example {
    public static void main(String[] args) {
        ImplementationC implementationC = new ImplementationC();

        InterfaceA ia = implementationC;
        ia.methodA();
        System.out.println();

        ((InterfaceB) implementationC).methodB();
        System.out.println();

        ((InterfaceC) implementationC).methodA();
        ((InterfaceC) implementationC).methodB();
        ((InterfaceC) implementationC).methodC();
    }
}
