package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //myCar.speed = 50; pvirvate 이라 직접 접근 불가능
        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());

        //stop 이 true 가 아니면 true 로 만들어라
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        //Car.java 에서 this.speed = 0; 이므로
        System.out.println(myCar.getSpeed());
    }
}
