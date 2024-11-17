package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int result1 = myCom.sum(1,2,3);
        System.out.println("result1: " + result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2: " + result2);

        // 배열을 result3 에 대입하는 방법
        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);

        //배열을 만드는 동시에 변수에 대입하는 방법
        int result4 = myCom.sum(new int[] {1,2,3,4,5,});
        System.out.println("result4: " + result4);

    }
}
