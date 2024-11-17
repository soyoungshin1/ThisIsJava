package ch14.sec09.exma01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        //스레드풀 생성
        //최대 5개까지의 스레드를 생성하여 작업을 처리
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //작업 생성과 처리 요청
        //스레드풀 종료
        executorService.shutdownNow();
    }
}
