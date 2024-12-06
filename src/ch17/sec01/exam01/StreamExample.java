package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("김길동");
        set.add("김자바");

        //외부반복자 이용
        for (String item : set) {
            System.out.println(item);
        }
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }

        //내부 반복자 이용
        Stream<String> stream= set.stream();
        //Stream 이 흘러갈때 람다식 실행된다
        stream.forEach((item) -> {
            System.out.println(item);
        });
        System.out.println();

        stream = set.stream();
        stream.forEach((item) -> System.out.println(item));


    }
}
