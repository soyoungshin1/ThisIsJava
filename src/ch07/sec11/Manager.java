package ch07.sec11;

//non-sealed = 봉인을 해제한다. 자식 클래스를 만들 수 있다
public non-sealed class Manager extends Person {
    //메소드 재정의
    @Override
    public void work(){
        System.out.println("생산 관리를 합니다");
    }
}
