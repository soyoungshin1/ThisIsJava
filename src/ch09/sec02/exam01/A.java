package ch09.sec02.exam01;

public class A {
    //인스턴스 멤버 클래스
    class B{
        //필드
        //생성자
        //메소드
        public void methodB(){
            System.out.println("methodB() 실행");
        }
    }

    //인스턴스 필드 값으로 B 객체 대입
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스턴스 메소드
    void method(){
        B b = new B();
    }
}
