package ch14.sec07.exam01;
// 스레드 안전 종료 - 1. 조건 이용
public class PrintThread extends Thread{
    private boolean stop;
    
    public void setStop(boolean stop){
        this.stop = stop; //외부에서 stop 필드를 변경할 수 있도록 Setter 선언
    }

    @Override
    public void run() {
        while (!stop){
            System.out.println("실행중"); //false 일때 
        }
        System.out.println("리소스 정리"); //true 일때
        System.out.println("실행 종료");
    }
}
