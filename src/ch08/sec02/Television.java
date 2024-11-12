package ch08.sec02;
//구현 클래스
//인터페이스의 추상메소드를 전부 재정의 해야한다.
public class Television implements RemoteControl{
    //메소드 재정의
    @Override
    public void turnOn() {
        System.out.println("tv를 켭니다");
    }


}
