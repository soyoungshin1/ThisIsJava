package ch11.sec05;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다");
        }
    }
    // throws 예외
    // 메소드를 호출하는 곳에서 try catch 구문 들어간다
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }

}
