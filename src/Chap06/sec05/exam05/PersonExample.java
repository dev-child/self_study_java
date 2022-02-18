package Chap06.sec05.exam05;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-12345","홍길동");

        System.out.println(p1.ssn);
//        p1.ssn = "변경"; 오류
        System.out.println(p1.name);
        p1.name = "변경 이름 : 도정관";
        System.out.println(p1.name);

    }
}
