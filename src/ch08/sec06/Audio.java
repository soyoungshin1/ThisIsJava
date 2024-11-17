package ch08.sec06;

public class Audio implements RemoteControl {

    //필드 선언
    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec05.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec05.RemoteControl.MAX_VOLUME;
        } else if (volume < ch08.sec05.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }


    //default 메소드 재정의
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음해제합니다");
            this.volume = this.memoryVolume;
        }
    }
}
