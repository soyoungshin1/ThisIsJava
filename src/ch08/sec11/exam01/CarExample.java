package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        //자동차 객체 생성
        Car myCar = new Car();

        //run() 메소드 실행
        myCar.run();

        //타이어 객체를 금호타이어로 교체
        //자동 타입 변환
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        //run() 메소드 실행
        myCar.run();
    }
}
