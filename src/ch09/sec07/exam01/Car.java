package ch09.sec07.exam01;

//익명 자식 객체
public class Car {
    //1. 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // ! 필드에 익명 자식 객체 대입
    //Tire 를 상속하는 자식 클래스를 {...} 로 만들건데 그걸 tire2 로 대입하겠다
    private Tire tire2 = new Tire(){
        //재정의 메소드
        @Override
        public void roll(){
            System.out.println("익명 자식 Tire 객체 1 이 굴러갑니다");
        }
    }; // new Tire(){...}; 인거라 ; 위치 주의

    //메소드(필드 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }
    //2. 메소드(로컬 변수 이용)
    public void run2(){
        // ! 로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire(){
            @Override
            public void roll(){
                System.out.println("익명 자식 Tire 객체 2 가 굴러갑니다");
            }
        };
        tire.roll();

    }
    //3. 메소드(매개변수 이용)
    public void run3(Tire tire){
        tire.roll();
    }
}
