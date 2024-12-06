package ch17.sec12.exam02;

//요소그룹핑
//Collectors.groupingBy()
//리턴타입 Map<K,List<T>>
//예제에서는 key 타입이 String, value 의 타입이 List<Student>
import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동","남",92));
        totalList.add(new Student("김수영","여",87));
        totalList.add(new Student("김자바","남",95));
        totalList.add(new Student("오해영","여",85));

        Map<String,List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(student -> student.getSex())
                );
        List<Student> maleList = map.get("남");
        maleList.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream()
                .forEach(student -> System.out.println(student.getName()));
    }
}
