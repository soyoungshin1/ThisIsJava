package ch15.sec03.exam01;

//HashSet
//hashCode() 같고, equals() 같으면 동등 객체라고 간주하여 저장 안함
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("java"); // 중복 객체이므로 저장하지 않음
        set.add("spring");

        //저장된 객체 수 출력
        System.out.println("총 객체 수: " + set.size());
    }
}
