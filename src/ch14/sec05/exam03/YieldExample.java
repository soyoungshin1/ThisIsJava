package ch14.sec05.exam03;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start(); //실행대기

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            workThreadA.work = false;
        } // workThreadA: 작업처리 출력
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            workThreadA.work = true;
        } // workThreadA 말고 다른 Thread 로 양보

    }
}
