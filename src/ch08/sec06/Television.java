package ch08.sec06;

public class Television implements ch08.sec06.RemoteControl {

    //필드 선언
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec06.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec06.RemoteControl.MAX_VOLUME;
        } else if (volume < ch08.sec06.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨: " + this.volume);
    }


}
