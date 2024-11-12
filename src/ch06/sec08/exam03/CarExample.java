package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //리턴갑싱 없는 setGas()메소드 호출
        myCar.setGas(5);

        //isLeftGas()메소드를 호출해서 받은 리턴값이 true일 경우 if 블럭 실행
        //if 조건식 자리에 t/f 로 나오는게 들어가야하는데 isLeftGas()메소드 타입이 boolean 이라 들어갈 수 있다
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다");
            
            //리턴값이 없는 run()메소드 호출
            myCar.run();
        }
        System.out.println("gas를 주입하세요");
    }
}
