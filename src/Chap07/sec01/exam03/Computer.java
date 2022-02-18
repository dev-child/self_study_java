package Chap07.sec01.exam03;

public class Computer extends Calculator{

//    @Override
//    double areaCircle(double r) {
//        System.out.println("Computer 객체에서 실행");
//        return Math.PI * r * r;
//    }


    @Override
    double areaCircle(double r) {
        return super.areaCircle(r);
    }
}
