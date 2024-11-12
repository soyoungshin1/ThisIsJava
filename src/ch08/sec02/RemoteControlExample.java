package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 타입의 변수 선언
        RemoteControl rc;
        //구현 객체 대입. = rc 라는 변수를 통해서 Television 을 사용하겠다
        rc = new Television();

        //인터페이스를 통해서 turnOn() 메소드 실행
        //실제 실행되는건 Television 의 turnOn() 메소드가 실행된다
        rc.turnOn();

        //다른 객체를 대입하면 그 객체의 메소드가 실행된다
        rc = new Audio();
        rc.turnOn();

    }
}
