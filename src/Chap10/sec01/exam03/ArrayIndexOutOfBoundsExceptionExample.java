package Chap10.sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        if (args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];
            System.out.println(args[0]);
            System.out.println(args[1]);
        } else {
            System.out.println("매개값이 필요합니다.");
        }
    }
}