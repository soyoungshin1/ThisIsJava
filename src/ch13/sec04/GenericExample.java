package ch13.sec04;

public class GenericExample {
    //제한된 타입 파라미터를 갖는 제네릭 메소드
    //Number 의 자식 클래스만 T 타입으로 들어갈 수 있다
    //t1, t2 로 사용할 수 있는 메소드는 Number 클래스의 메소드
    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        //Number 의 메소드 사용
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        //제네릭 메소드 호출
        boolean result2 = compare(4.5,4.5);
        System.out.println(result2);
    }




}
