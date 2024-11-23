package ch16.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.ordering((a, b)->{
            return a.compareToIgnoreCase(b);
        });
        
        //실행문이 하나라 아래처럼 생략가능
        person.ordering((a, b)-> a.compareToIgnoreCase(b));

        //메소드 참조 방식
        person.ordering(String :: compareToIgnoreCase);

    }
}
