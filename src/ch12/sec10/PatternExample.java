package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-1234-5678";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다");
        }  else {
            System.out.println("정규식과 일치하지 않습니다");
        }
        
        regExp = "\\w+@\\w+ww.\\w+(\\.\\w+)?";
        data = "angel@mycompany.com";
        boolean result1 = Pattern.matches(regExp, data);
        if (result1) {
            System.out.println("정규식과 일치합니다");
        } else {
            System.out.println("정규식과 일치하지 않습니다");
        }
    }
}
