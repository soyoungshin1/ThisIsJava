package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        //객체 추가
        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("spring");

        //객체를 하나씩 가져와서 처리
        //객체 존재 확인 후 제거, 추가 할 때 반드시  Iterator 로 해야함
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){ //다음 객체가 있으면
            //객체를 하나씩 가져오기
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("jsp")) {
                //가져온 객체를 컬렉션에서 제거
                iterator.remove(); //Iterator 에서 제거 x, Set 에서 제거 o
            }
        }
        System.out.println();

        //객체 제거
        set.remove("jdbc");

        //객체를 하나씩 가져와서 처리
        for (String element : set) { //향상된 for 문 - Iterable 을 구현한 객체(배열 , List, Set)
            System.out.println(element);
        }
    }
}
