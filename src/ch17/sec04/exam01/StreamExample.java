package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//컬렉션으로부터 스트림 얻기
//리턴타입 Stream<T>
//메소드 stream(), parallelStream()
//리소스 List, Set 컬렉션
public class StreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            Product product =new Product(i, "상품" + i, "회사이름", (int)(10000*Math.random()));
            list.add(product);
        }

        //객체 스트림 얻기
        Stream<Product> stream = list.stream();
        stream.forEach(product -> System.out.println(product));
    }
}
