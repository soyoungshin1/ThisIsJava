package ch07.sec08.exam02;
// 매개 변수의 다형성

public class DriverExample {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.driver(bus); //Bus 의 run() 이 실행

        //메개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi();
        driver.driver(taxi); // Taxi 의 run() 이 실행
    }
}
