package Chap06.sec04.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.execuate();
        System.out.println(myCalc.plus(1,2));
        System.out.println(myCalc.avg(5,20));
    }
}
