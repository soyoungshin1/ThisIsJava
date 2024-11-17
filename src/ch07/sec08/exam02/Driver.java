package ch07.sec08.exam02;

public class Driver {
    //메소드 선언
    //클래스 타입의 매개변수
    //매개변수에는 vehicle 이나 vehicle 의 자식 객체가 올 수 있다
    public void driver(Vehicle vehicle){
        vehicle.run(); //vehicle 이 가지고 있는 run() 메소드 실행
    }
}
