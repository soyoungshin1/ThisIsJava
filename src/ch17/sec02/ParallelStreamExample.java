package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("홍길동");
        list.add("김길동");
        list.add("이길동");
        list.add("박길동");
        list.add("최길동");

        //병렬 스트림 생성
        Stream<String> stream = list.parallelStream();
        stream.forEach(name -> {
            Thread thread = Thread.currentThread();
            System.out.println(name +": " + thread.getName() );
        });
    }
}
