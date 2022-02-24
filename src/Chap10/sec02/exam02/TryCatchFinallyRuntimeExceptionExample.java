package Chap10.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("부족합니다.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 불가");
        } finally {
            System.out.println("다시 실행 하시요");
        }


    }
}
