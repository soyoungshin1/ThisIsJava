package ch14.sec09.exma03;

import java.util.concurrent.*;

public class CallableSubmitExample {
    public static void main(String[] args) {
        //ExecutorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //계산 작업 생성 및 처리 요청
        for (int i = 0; i <= 100; i++) {
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                //Callable  은 call() 로 실행
                //Callable<T> 에 따라 메소드의 return 값 정해짐
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 0; i <= idx; i++) {
                        sum += i;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");

                    return sum; //Callable 은 반드시 return 값 있어야함
                }
            });

            try {
                int result = future.get();
                System.out.println("\t리턴값: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //ExecutorService 종료
        executorService.shutdown();
    }
}
