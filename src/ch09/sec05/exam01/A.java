package ch09.sec05.exam01;

//인스턴스 멤버 클래스 - 바깥클래스의 모든 필드와 메소드 사용 o
//정적 멤버 클래스 - 바깥클래스의 정적 필드와 정적 메소드
public class A {
    //A의 인스턴스 필드와 메소드
    int field1;
    void method1(){

    }
    //A의 정적 필드와 메소드
    static int field2;
    static void method2(){

    }
    //인스턴스 멤버 클래스
    class B{
        void method(){
            //A의 인스턴스 필드와 메소드 사용 o
            field1 = 10;
            method1();
            //A의 정적 필드와 메소드 사용 o
            field2 = 10;
            method2();
        }
    }

    // 정적 멤버 클래스
    static class C{
        void method(){
            //A의 인스턴스 필드와 메소드 사용 x
            //A 객체가 있어야하는것 사용 x
            //field1 = 10;
            //method1();
            //A의 정적 필드와 메소드 사용 o
            field2 = 10;
            method2();
        }

    }
}
