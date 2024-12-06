package ch17.sec06.exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        //문장 스트림ㅇ을 단어 스트림으로 변환
        List<String> list = new ArrayList<>();
        list.add("this is java");
        list.add("i am a best developer");
        list.stream()
                .flatMap(data-> Arrays.stream(data.split(" ")))
                .forEach(word-> System.out.println(word));

        System.out.println();

        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환
        List<String> list1 = Arrays.asList("10, 20, 30", "40, 50");
        list1.stream() //스트림 2개
                .flatMapToInt(data->{
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr); //int 배열을 IntStream 으로 변환. 스트림 5개
                })
                .forEach(number-> System.out.println(number));

    }
}
