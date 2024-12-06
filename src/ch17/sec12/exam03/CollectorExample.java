package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//그룹핑 후 집계처리
//averageDouble() 평균, counting() 요소수 등
public class CollectorExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 85));
        totalList.add(new Student("김자바", "남", 87));
        totalList.add(new Student("오해영", "여", 95));

        Map<String,Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                student -> student.getSex(),
                                Collectors.averagingDouble(student -> student.getScore())
                        )
                );
        System.out.println(map);

    }
}
