package ch08.sec11.exam01;
//Tire 인터페이스를 구현하는 구현 클래스
public class KumhoTire implements Tire{
    //추상메소드 재정의
    @Override
    public void roll() {
        System.out.println("금호타이어가 굴러갑니다");
    }
}
