package ch15.sec08;

//수정할 수 없는 불변 컬렉션으로 만들기
//읽기 전용
//of(), copyOf(), asList()
import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        //List 불변 컬렉션 생성
        List<String> immutableList1 = List.of("A","B","C");
        //immutableList1.add("D"); X

        //Set 불변 컬렉션 생성
        Set<String> immutableSet1 = Set.of("A","B","C");
        //immutableSet1.remove("A"); X

        //Map 불변 컬렉션 생성
        Map<Integer,String> immutableMap1 = Map.of(
                1,"A",
                2,"B"
        );
        //immutableMap1.put(4,"D");

        //List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        //Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        //Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        Map<Integer,String> immutableMap2 = Map.copyOf(map);

        //배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A","B","C"};
        List<String> immutableList3 = Arrays.asList(arr);

    }
}
