package ch06.sec13.exam03.package1;

public class A {
    //필드 선언
    public int field1;
    int field2;
    private int field3;

    //메소드 선언
    public void method1(){

    }
    void method2(){

    }
    private void method3(){
        
    }
    //생성자 선언
    //클래스 내부의 필드읽고 변경가능, 메소드 호출가능. 접근 제한자의 영향x
    public A(){
        field1 = 1;
        field2 = 1;
        field3=3;
        
        method1();
        method2();
        method3();
    }

}
