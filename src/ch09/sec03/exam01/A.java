package ch09.sec03.exam01;

public class A {
    //인스턴스 멤버 클래스
    static class B{
        void methodB(){
            System.out.println("methodB() 실행");
        }
    }

    //인스턴스 필드 값으로 B 객체 대입
    B field1 = new B();

    //정적 필드 값으로 B 객체 대입
    // -> A 객체 없이도 B를 사용할 수 있다
    static B field2 = new B();

    //생성자
    A(){
        B b = new B();
    }
    //인스턴스 메소드
    void method1(){
        B b = new B();
    }
    //정적 메소드
    static void method2(){
        //A객체 없어도 B 객체 사용 가능
        B b = new B();
    }
}
