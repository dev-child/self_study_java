package Chap10.sec02.exam03;

public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값이 부족");
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 못함");
        } finally {
            System.out.println("다시 실행");
        }
    }
}
