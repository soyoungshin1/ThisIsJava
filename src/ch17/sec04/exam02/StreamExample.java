package ch17.sec04.exam02;

//배열로부터 스트림 얻기
//리턴타입 Stream<T>, IntStream, LongStream, DoubleStream
//메소드 Array.Stream(배열객체)
//리소스 배열
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //String<T>
        String[] strArray = {"홍길동", "김길동" , "이길동"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item));
        System.out.println();

        //int[]
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.println(item));
        System.out.println();;
    }
}
