package ch08.sec13;

//구현 클래스
public class ImplClass implements InterfaceC {
    //상속받은 인터페이스의 메소드 전부 재정의
    @Override
    public void methodC() {
        System.out.println("methodC() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() 실행");
    }

    @Override
    public void methodA() {
        System.out.println("methodA() 실행");
    }
}
