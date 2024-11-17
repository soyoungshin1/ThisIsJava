package ch13.sec02.exam02;

//Rentable<P> 를 구현하는 클래스
//타입 파라미터 P를 Car 로 대체
public class CarAgency implements Rentable<Car>{
    //메소드 재정의 시 반드시 리턴 타입을 Car 여야함
    @Override
    public Car rent() {
        return new Car();
    }
}
