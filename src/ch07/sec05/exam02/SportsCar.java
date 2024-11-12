package ch07.sec05.exam02;

public class SportsCar extends Car{
    //speedUp() 메소드 재정의
    @Override
    public void speedUp(){
        speed += 10;
    }

    /*
    final 메소드는 재정의 불가
    @Override
    public void stop(){
    system.out.println("스포츠카를 멈춤");
    speed = 0;
     */
}
