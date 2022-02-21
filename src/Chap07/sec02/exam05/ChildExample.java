package Chap07.sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";

        Child child = (Child) parent;

        child.field2 = "dat2";
        System.out.println(child.field2);
        child.method3();
    }
}
