package ch12.sec05;

//StringBuilder
//~Builder 는 아래와 같은 문법인 경우가 많음. 문법 주의
public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("def")
                .insert(0, "abc")
                .delete(3,4)
                .toString();
        System.out.println(data);
    }
}
