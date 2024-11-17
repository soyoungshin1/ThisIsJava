package ch07.sec04.exam01;

public class Computer extends Calculator{
    //메소드 오버라이딩

    //@Override 어노테이션 : 컴파일 시 정확히 오버라이딩이 되었는지 체크함
    @Override
    //메소드 재정의할때 접근 제한자 더 강해질 수는 없음. 더 약해지는건 가능. 대부분 동잃하게함.
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
