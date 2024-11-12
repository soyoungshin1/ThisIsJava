package ch07.sec03.exam02;

public class SmartPhone extends Phone {

    //생성자 선언
    public SmartPhone(String model, String color){
        super(model, color); // 맨첫줄에 작성, 생략가능, 없어도 기본적으로 부모 생성자 생성 코드 들어간다
        //부모의 생성자가 매개변수가 있으면 super() 에 매개변수 넣어서 작성해야함
        //this.model = model;
        //this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
