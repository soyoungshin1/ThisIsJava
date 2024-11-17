package ch07.sec08.exam01;
//필드의 다형성
//자동 타입 변환 + 메소드 재정의(오버라이딩)
public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();

        //Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 객체 장착
        //재정의된 run() 실행됨 
        myCar.tire = new HankookTire();
        myCar.run();

        //KumhoTire 객체 장착
        //재정의된 run() 실행됨

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
