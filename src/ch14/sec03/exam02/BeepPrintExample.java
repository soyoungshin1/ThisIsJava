package ch14.sec03.exam02;
// 1. Thread 객체 직접 생성 . Runnable 인터페이스를 사용함
//소리 내는 동시에 글자 출력하기
import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //작업1
        //Thread 클래스로부터 작업 스레드 객체 생성
        // Runnable 안터페이스 구현 객체를 매개값으로 갖는 생성자 생성
        Thread thread = new Thread(new Runnable() {
            //Runnable 의 run() 메소드 재정의
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
                for (int i = 0; i < 5 ; i++) {
                    toolkit.beep(); //소리 발생
                    try {
                        Thread.sleep(1000); // 0.5 초간 일시정지
                    } catch (InterruptedException e) {

                    }

                }
            }
        });
        //thread 시작 . main 클래스가 시작되는 동시에 새로운  thread 가 시작
        thread.start();
        //작업2
        /*for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }*/
        //Runnable 구현 객체를 따로 클래스로 만들어서 그걸로 thread 객체 만들고 실행시키기
        //여러 파일에서 재사용될 때 유리함
        Runnable task = new Task();
        Thread thread2 = new Thread(task);
        thread2.start();
    }
}
