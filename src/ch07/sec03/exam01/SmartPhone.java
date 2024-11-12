package ch07.sec03.exam01;

public class SmartPhone extends Phone{

    //생성자 선언
    public SmartPhone(String model, String color){
        super(); // 맨첫줄에 작성, 생략가능, 없어도 기본적으로 부모 생성자 생성 코드 들어간다
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
