package Chap06.sec04.exam06;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        /*정사각형*/
        System.out.println(myCalc.areaRectangle((double) 20));

        /*직사각형*/
        System.out.println(myCalc.areaRectangle((double) 10,(double) 20));
    }
}
