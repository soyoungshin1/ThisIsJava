package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
    public C(){
        A a = new A();

        a.field1 = 1;
        //a.field2 = 1; 다른 패키지에서 - 사용 불가능
        //a.field3 = 1; 다른 패키지에서 private 사용 불가능

        a.method1();
        //a.method2();
        //a.method3();
    }
}
//--> 클래스를 설계할때 접근 제한자를 잘 생각해서 붙여야한다