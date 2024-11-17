package ch13.sec02.exam02;

//Rentable<P> 를 구현하는 클래스
//타입 파라미터 P를 Home 으로 대체
public class HomeAgency implements Rentable<Home>{
    //메소드 재정의 시 반드시 리턴 타입이 Home 이어야함
    @Override
    public Home rent() {
        return new Home();
    }
}
