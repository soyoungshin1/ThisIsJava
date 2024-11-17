package ch08.sec07;

public interface Service {
    //디폴트 메소드
    default void defaultMethod1(){
        System.out.println("defaultMethod 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
        //private 메소드인 defaultCommon() 이 없으면 무한 루프
    }

    //private 메소드
    //객체가 필요함. 디폴트메소드, 정적메소드의 중복코들를 줄이기 위해 사용
    //인터페이스에서만 사용 가능
    private void defaultCommon(){
        System.out.println("defalutMethod 중복 코드 A");
        System.out.println("defalutMethod 중복 코드 B");

    }
    //정적 메소드
    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    //private 정적 메소드
    //객체가 필요 없음
    private static void staticCommon(){
        System.out.println("staticMethod 중복코드 C");
        System.out.println("staticMethod 중복코드 D");

    }
}
