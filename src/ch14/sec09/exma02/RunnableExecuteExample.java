package ch14.sec09.exma02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
    public static void main(String[] args) {
        //1000의 메일 생성
        String[][] mails = new String[1000][3];
        for (int i = 0; i < 1000; i++) {
            mails[i][0] = "admin@my.com";
            mails[i][1] = "member" + i + "@my.com";
            mails[i][2] = "신상품 입고";
        }
        //ExecuteService 생성 (ThreadPool)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //이메일을 보내는 작업 생성 및 처리 요청
        for (int i = 0; i < 1000; i++) {
            final int idx = i;
            //작업 큐에서 스레드 풀로 작업 하나씩 보내기
            //Runnable 은 리턴타입 x  -> execute() 로 실행
            //Callable 은 리턴타입 Future<T> -> submit() 으로 실행
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    System.out.println("[" + thread.getName() + "]" + from + "==>" + to +content );
                }
            });
        }
        //ExectorService 종료
        //shutdown() 은 작업 중인 스레드 종료될 때까지 기다린 후 종료
        //shutdownNow() 는 작업 중인 스레드 있어도 강제 종료. 작업 큐에 있는 건 List<Runnable> 로 받음
        executorService.shutdown();
    }
}
