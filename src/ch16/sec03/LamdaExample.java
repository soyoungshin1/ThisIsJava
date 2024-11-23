package ch16.sec03;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        
        //매개변수가 두 개 있는 람다식
        person.action1((name, job) ->{
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다");
        });
        //매개변수가 두 개 있는 람다식
        /*
        person.action1((name, job) ->{
            System.out.print(name + "이");
            System.out.println(job + "을 하지 않습니다");
        });
        */
        
        
        //실행문이 한 줄인 경우 { } 안 붙여도 됨
        person.action1((name, job)-> System.out.println(name + "이" + job + "을 하지 않습니다"));
        /*
        person.action2((content) ->{
            System.out.print("\"" + content + "\"");
            System.out.println("라고 말합니다");
        });
        */
        //매개변수가 한 개일 경우 매개변수에 괄호 안붙여도 됨
        person.action2(content -> System.out.println("\"" + content + "\"" + "라고 말합니다"));
    }
}
