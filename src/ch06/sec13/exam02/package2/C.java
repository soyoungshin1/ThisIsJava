package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
    A a1 = new A(true);
    //A a2 = new A(1); // 다른 패키지의 default 생성자 사용 불가능
    //A a3 = new A("문자열"); //다른 패키지의 private 생성자 사용 불가능

}