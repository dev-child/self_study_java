package Chap07.sec02.exam06;

public class InstanceOfExample {
    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("메소드 1 > Child 로 변환 성공");
        } else {
            System.out.println("메소드 1 > Child 로 변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("메소드 2 > Child 로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        method1(parent);
        method2(parent);

        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);
    }
}
