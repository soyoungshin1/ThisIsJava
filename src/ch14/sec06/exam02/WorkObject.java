package ch14.sec06.exam02;

public class WorkObject {
    //동기화 메소드 또는 동기화 블록 내에서만 사용 가능
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify(); //다른 스레드를 실행 대기 상태로 만듦
        try {
            wait(); //자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {

        }

    }
    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            
        }
    }
}
