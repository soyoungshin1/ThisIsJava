package ch08.sec09;

// 상속받은 인터페이스의 추상메소드, 자식 인터페이스의 추상 메소드 전부 사용 가능
public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();


        //인터페이스 상속 기본 문법
        //자식인터페이스 변수 = new 구현클래스();
        //부모인터페이스1 변수1 = new 구현클래스();
        //부모인터페이스2 변수2 = new 구현클래스();

        InterfaceA ia = new InterfaceCImpl();
        ia.methodA();
        //ia.methodB(); 불가
        System.out.println();

        InterfaceB ib = new InterfaceCImpl();
        //ib.methodA(); 불가
        ib.methodB();
        System.out.println();

        InterfaceC ic = new InterfaceCImpl();
        ic.methodA();
        ic.methodB();
        ic.methodC();


    }
}
