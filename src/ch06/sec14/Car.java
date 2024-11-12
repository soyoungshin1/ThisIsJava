package ch06.sec14;

public class Car {
    //필드선언
    private  int speed;

    private boolean stop;

    // 필드가 private 이라 외부에서 접근 불가능
    // 하지만, 외부에서 읽고 쓸수있게 하려면 getter setter 이용하면 됨
    //getter setter 단축키 alt + insert

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }
    //boolean 형식의 필드 getter 는 앞에 get 이 아니라 is 로 생성
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        //stop = true 이면 speed 를 0으로
        if (stop) {
            this.speed = 0;
        }
    }

}
