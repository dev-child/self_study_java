package Chap02.sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {

//        큰거 > 작은거
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

    }
}
