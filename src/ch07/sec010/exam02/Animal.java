package ch07.sec010.exam02;
//추상 메소드
public abstract class Animal {
    //메소드 선언
    public void breathe(){
        System.out.println("숨을 쉽니다");
    }
    //추상 메소드 선언
    public abstract void sound();
}
