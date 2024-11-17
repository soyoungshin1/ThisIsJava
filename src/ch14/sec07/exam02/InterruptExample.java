package ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }


        thread.interrupt(); //일시 정지 상태에 있는 스레드를 InterruptException 발생시킴
    }
}
