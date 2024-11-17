package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    //상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    //상태필드 선언
    public int flyMode = NORMAL;

    //메소드 재정의
    @Override
    public void fly(){
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다");
        } else {
            //Airplane 객체의 fly() 메소드 호출
            //부모 클래스의 메소드를 그대로 사용하고 싶을 때 super
            super.fly();
        }
    }
}