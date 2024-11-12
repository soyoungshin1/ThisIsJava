package ch08.sec02;
//인터페이스
public interface RemoteControl {
    //public 추상 메소드
    //추상메소드는 {} 없음.
    //RemoteControl 인터페이스로 turnOn() 기능을 사용할 수 있다. 실제 사용은 클래스에서
    //abstract 붙여도 되고 안붙여도 됨. 기본이 public
    public void turnOn();
}
