package ch08.sec010.exam02;

public class CastingExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Vehichle vehichle = new Bus();

        //인터페이스를 통해서 메소드 호출
        //이렇게 되면 인터페이스에 있는 메소드 밖에 호출 못함
        vehichle.run();
        System.out.println();

        //Bus 타입으로 다시 강제 타입 변환
        //클래스에 있는 메소드도 사용 가능
        Bus bus = (Bus) vehichle;
        bus.run();
        bus.checkFare();
    }
}
