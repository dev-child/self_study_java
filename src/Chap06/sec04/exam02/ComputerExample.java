package Chap06.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values = {1,2,3};
        int result1 = myCom.sum(values);
        System.out.println(result1);

        int result2 = myCom.sum2(1,2,34);
        System.out.println(result2);
    }
}
