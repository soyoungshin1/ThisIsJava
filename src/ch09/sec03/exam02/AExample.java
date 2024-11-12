package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        //B객체 생성 및 인스턴스 필드 및 메소드 사용
        A.B b = new A.B();
        System.out.println(b.field1);
        b.method1();

        //B 클래스의 정적 필드 및 메소드 사용
        //static 붙은 정적 필드, 메소드는 객체 생성x
        //A.B.필드 , A.B.메소드로 사용
        System.out.println(A.B.field2);
        A.B.method2();

        // -> 이런 형태 해석
        // A 클래스 안에 B 클래스가 static 으로 정의되어있고, 다시 B 클래스 안에 static 으로 field2 와 method2 가 정의되어있다
    }
}
