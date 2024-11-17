package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car car = new Car();

        //익명 자식 객체가 대입된 필드 사용
        car.run1();

        //익명 자식 객체가 대입된 로컬변수 사용
        car.run2();
        
        // ! 익명 자식 객체가 대입된 매개변수 사용
        // 매개 변수 자리에 Tire() 의 익명 자식 클래스를 넣음
        car.run3(new Tire(){
            @Override
            public void roll(){
                System.out.println("익명 자식 Tire 객체 3 이 굴러갑니다");
            }
        });
    }
    
}
