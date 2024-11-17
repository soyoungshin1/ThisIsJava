package ch08.sec010.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        
        //구현 객체 생성 (클래스)
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        
        //인터페이스 변수 선언
        A a;
        
        //변수에 구현 객체 대입
        //인터페이스 <- 구현 클래스 객체
        //자동 타입 변환
        a = b;
        a = c;
        a = d;
        a = e;
    }
}
