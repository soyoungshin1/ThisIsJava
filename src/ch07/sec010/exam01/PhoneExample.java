package ch07.sec010.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone() {} 직접 객체 생성 하는 것 불가능

        //SmartPhone 으로 객체 생성
        SmartPhone smartPhone = new SmartPhone("홍길동");

        //메소드 호출
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
