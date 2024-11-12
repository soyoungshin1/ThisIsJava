package ch08.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //구현객체가 반드시 있어야함 rc = new Television(); 부분
        rc.setMute(true);
        rc.setMute(false);
        System.out.println("현재 볼륨: " + rc.getVoulme());

        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.setVolume(7);
        rc.setMute(true);
        rc.setMute(false);
        System.out.println("현재 볼륨: " + rc.getVoulme());



    }
}
