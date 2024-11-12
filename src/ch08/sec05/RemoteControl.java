package ch08.sec05;

public interface RemoteControl {
    //상수 필드 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메소드 선언
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    int getVoulme();
    //디폴드 메소드 선언
    //모든 객체가 사용할 수 있는 메소드. 객체가 있어야만 호출 할 수 있음.
    default void setMute(boolean mute){
        if (mute == true) {
            System.out.println("무음처리합니다");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음해제합니다");
        }
    }
}
