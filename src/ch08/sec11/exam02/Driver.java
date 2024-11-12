package ch08.sec11.exam02;
//매개변수의 다형성

public class Driver {
    //만약 메소드의 매개변수 자리에 인터페이스가 들어가있으면
    // 그 자리에는 인터페이스를 구현하는 객체가 모두 올 수 있다
    // 그 객체에 따라 실행 결과가 달라진다
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}
