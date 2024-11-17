package ch07.sec11;

//non-sealed 클래스 Manager 로부터 만들어진 자식 클래스
public class Director extends Manager{
    //Manager 의 work()  메소드 재정의
    @Override
    public void work(){
        System.out.println("제품을 기획합니다");
    }
}
