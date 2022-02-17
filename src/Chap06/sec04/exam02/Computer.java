package Chap06.sec04.exam02;

public class Computer {
    int sum(int[] values) {
        int sum = 0;
        for (int i =0; i <values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        int sum2 = 0;
        for (int i =0; i <values.length; i++) {
            sum += values[i];
        }

        for (int value: values) {
            sum2 += value;
        }

        return sum2;
    }
}
