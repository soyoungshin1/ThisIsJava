package ch15.sec02.exam03;


//LinkedList 인접 객체를 체인처럼 연결
//빈번한 삭제,삽입이 일어나는 곳에서 성능 좋음
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //ArrayList 컬렉션 객체 생성
        ArrayList<String> list1 = new ArrayList<>();
        //LinkedList 컬렉션 객체 생성
        LinkedList<String> list2 = new LinkedList<>();

        //시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        //ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i)); //숫자를 문자열로 바꿈
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간: " , (endTime-startTime));

        //LinkedList 컬렉션에 저장되는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: " ,(endTime-startTime));
    }
}
