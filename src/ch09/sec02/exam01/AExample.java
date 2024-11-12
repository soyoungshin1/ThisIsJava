package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        //B 객체 생성
        // A 안에 있는 B 클래스 타입으로, 변수 b 를 선언하고, a 객체를 먼저 만들고 B 객체를 만든다
        A.B b = a.new B();

        b.methodB();
    }
}
