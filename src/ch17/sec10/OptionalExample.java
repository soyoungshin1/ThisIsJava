package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /* 이렇게 하면 요소가 없을 경우에 에러 발생
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble()
        */
        //방법1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1_평균: " + optional);
        } else {
            System.out.println("방법1_평균: 0.0"); //default 값 주기
        }
        //방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균: " + avg);

        //방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3_평균:" + a)); //true 일 경우에 출력 실행
    }


}
