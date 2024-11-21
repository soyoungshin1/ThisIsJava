package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


//ArrayList, HashSet, HashMap 은 동기화 메소드로 구성되어 있지 않아 멀티스레드 환경에서 안전하지 않음
//멀티스레드 환경에서 사용하고 싶을때 synchronizedList(List<T> list), synchronizedMap(Map<T> map), synchronizedSet(Set<T> set)
public class SynchronizedMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());

        //작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run() {
                //객체 1000개 추가
                for (int i = 0; i <= 1000 ; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };

        //작업스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run() {
                //객체  1000개 생성
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용" +i);
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 ㅎ함
        try {
            threadA.join();
            threadB.join();

        } catch (InterruptedException e) {

        }

        //저장된 총 객체수 얻기
        int size = map.size();
        System.out.println("총 객체 수: " + size);


    }
}
