package ch11.sec02.exam02;


//컴파일러가 잡는 오류 = 일반 예외
//컴파일러가 알려주지 않고 실행하는 예외 = 실행 예외 
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("주어진 클래스가 있습니다");
        } catch (ClassNotFoundException e) {
            System.out.println("주어진 클래스는 없습니다");
        } //java.lang.String 은 원래 있는 클래스임
        System.out.println();
        try {
            Class.forName("java.lang.String2");
            System.out.println("주어진 클래스가 있습니다");
        } catch (ClassNotFoundException e) {
            System.out.println("주어진 클래스는 없습니다");
            e.printStackTrace();
        }
    }
}
