package ch17.sec04.exam03;

//숫자범위로부터 스트림 얻기
//리턴 타입 IntStream
//메소드 IntStream.rang(int, int) , IntStream.rangeClosed(int, int) 뒤 숫자도 포함 범위
//리소드 int 범위
import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}
