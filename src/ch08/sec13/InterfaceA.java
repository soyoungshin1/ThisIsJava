package ch08.sec13;

//public sealed interface InterfaceA permits InterfaceB
// -> InterfaceA 의 자식 인터페이스는 InterfaceB 만 가능하고 ,
// 그 이욍에는 자식 인터페이스가 될 수 x
public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
