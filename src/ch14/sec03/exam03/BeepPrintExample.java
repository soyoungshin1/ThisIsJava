package ch14.sec03.exam03;
// 2. Thread 익명 자식 객체 생성
//소리 내는 동시에 글자 출력하기
import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //작업1
        //Thread 부모를 가지고 익명 자식 객체를 만들건데 {} 안의 내용으로 thread 생성한다
        Thread thread = new Thread(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e){

                    }
                }
            }
        };
        thread.start();
        //작업2
        /*for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }*/
        
        //Thread 를 상속받은 PrintThread 를 통해 객체 생성
        //thread2 시작
        Thread thread2 = new PrintThread();
        thread2.start();
    }

}
