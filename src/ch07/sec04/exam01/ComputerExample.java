package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        //여기서 areaCircle() 메소드는 재정의된 메소드를 사용하게됨
        System.out.println("원 면적: " + computer.areaCircle(r));
    }
}
