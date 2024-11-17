package ch08.sec09;

// 상속받은 인터페이스의 추상메소드, 자식 인터페이스의 추상 메소드 전부 재정의 해야함
// 상속받은 인터페이스의 추상메소드, 자식 인터페이스의 추상 메소드 전부 사용 가능

public class InterfaceCImpl implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("InterfaceC() 실행");
    }

    @Override
    public void methodA() {
        System.out.println("InterfaceA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceB() 실행");
    }
}
