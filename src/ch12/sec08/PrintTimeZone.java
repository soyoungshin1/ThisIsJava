package ch12.sec08;

import java.util.TimeZone;
//Timezone 모두 보기
public class PrintTimeZone {
    public static void main(String[] args) {
        String[] available = TimeZone.getAvailableIDs();
        for (String id : available) {
            System.out.println(id);
        }
    }
}
