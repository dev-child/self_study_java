package Chap11.sec01.exam09;

import Chap08.sec02.exam01.Car;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.jpg").getPath();

        System.out.println(photo1Path);

    }
}
