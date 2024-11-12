package ch08.sec13;

//public non-sealed interface InterfaceB extends InterfaceA
// -> 봉인 해제. InterfaceB 는 다른 자식 인터페이스를 만들 수 있다
public non-sealed interface InterfaceB extends InterfaceA {
    void methodB();
}
