package ch17.sec03;

import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동",10),
                new Student("김길동", 20),
                new Student("서길동", 30)
        );
        double avg = list.stream()
                .mapToInt(student -> student.getScore()) //student 객체에서 getScore 로 score 받아와서 int로 변환
                .average()//평균계산
                .getAsDouble(); //double 형식으로 받기
        System.out.println("평균점수: " + avg);

        list.stream()
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));
    }
}
