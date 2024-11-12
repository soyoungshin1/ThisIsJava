package ch09.sec04.exam03;

//로컬 변수(생성자, 메소드 내부에서 선언된 변수)를 로컬 클래스에서 사용할 경우
//로컬 변수는 final 특성을 갖게 되므로 값을 수정 할 수 x

public class A {
    //메소드
    public void method1(int arg){
        //로컬 변수
        int var = 1;

        //로컬 클래스
        class B{
            //메소드
            void method2(){
                //로컬 변수 읽기 는 가능 
                //로컬 클래스 에서 사용했을 경우
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                //로컬 변수 수정 불가능
                //arg = 2;
                //var = 2;
            }
        }
        //로컬 객체 생성
        B b = new B();
        //로컬 객체 메소드 호출
        b.method2();

        //로컬 변수 수정 불가능
        //arg = 3;
        //var = 3;
    }
}
