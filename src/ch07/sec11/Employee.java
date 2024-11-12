package ch07.sec11;

//final = 더 이상 상속할 수 없다. 자식 클래스를 만들 수 없다.
public final class Employee extends Person {
    //메소드 재정의
    @Override
    public void work(){
        System.out.println("제품을 생산합니다");
    }
}
