package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        //Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /* 불가능
        Parent 타입으로 변환해놨기 때문에
        parent.field2 ="data2";
        parent.method3();
         */

        //강제 타입 변환
        //parent 를 다시 Child 타입으로 복원하고 싶을때
        Child child = (Child) parent;

        //Child 타입으로 필드와 메소드 사용
        child.field2 = "data2";
        child.method3();
    }
}
