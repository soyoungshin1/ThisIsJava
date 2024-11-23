package ch16.sec01;


public class LamdaExample {
    public static void main(String[] args) {

        //람다식 1
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        //람다식 2
        action((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });


    }

    //main 메소드 바깥에 있는 action() 메소드
    //Calculable 인터페이스 구현 객체에서 calculate() 메소드 사용
    public static void action(Calculable calculable) {
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);

    }
}