package ch14.sec05.exam03;

public class WorkThread extends Thread{
    //필드
    public boolean work = true;

    //생성자
    public WorkThread(String name) {
        setName(name);
    }
    //메소드
    @Override
    public void run() {
        while (true) { //true 이면 빠져나감, false 이면 실행내용 무한반복
            if (work) { //false 이면 아래내용 실행, true 이면 다른 Thread 실행되게 양보
                System.out.println(getName() + ": 작업처리");
            }else {
                Thread.yield();
            }
        }
    }
}
