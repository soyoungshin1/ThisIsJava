package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        //split 여러종류의 구분자 있을때 정규식으로 구분 가능
        String data1 = "홍길동&이수홍,박연수";
        String [] arr = data1.split("&|,");
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        //StringTokenizer 한 종류의 구분자만 있을때
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
