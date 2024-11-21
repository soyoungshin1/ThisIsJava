package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//Vector  동기화된 메소드로 구성되어 있음
//멀티 스레드가 동시에 Vector 메소드를 실행x
//멀티 스레드 환경일 때 사용
public class VectorExample {
    public static void main(String[] args) {
        //Vector 컬렉션 생성
        List<Board> list = new Vector<>();

        //작업 스레드 객체 생성
        Thread threadA  = new Thread(){
            @Override
            public void run() {
                //객체 1000개 추가
                for (int i = 0; i <= 1000; i++) {
                    list.add(new Board("제목" + i , "내용" + i , "글쓴이" + i));
                }
            }
        };
        //작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용"+ i, "글쓴이" + i));
                }
            }
        };

        //작업 스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료될 때가지 메인 스레드를 기다리게 함
        try {
            threadB.join();
            threadA.join();
        } catch (InterruptedException e) {

        }
        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();
    }
}
