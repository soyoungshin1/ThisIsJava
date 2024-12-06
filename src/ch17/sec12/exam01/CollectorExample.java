package ch17.sec12.exam01;

//요소 수집
//Stream 의 collect(Collector<T,A,R> collector) 메소드는 필터링 or 매핑된 요소를 새로운컬렉션에 수집
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        //남학생만 묶어 List 로 저장
        /*List<Student> maleList = totalList.stream()
                .filter(student -> student.getSex().equals("남"))
                .collect(Collectors.toList());*/

        List<Student> maleList = totalList.stream()
                .filter(student -> student.getSex().equals("남"))
                .toList();
        maleList.stream()
                .forEach(student -> System.out.println(student.getName()));
        System.out.println();

        //학생이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String,Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                student -> student.getName(),//Student 객체에서 키가 될 부분 리턴
                                student -> student.getScore() //Student 객체에서 값ㅅ이 될 부분 리턴
                        )
                );
        System.out.println(map);

    }
}
