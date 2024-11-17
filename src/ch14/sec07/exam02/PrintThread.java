package ch14.sec07.exam02;

//interrupt() 메소드 사용
public class PrintThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("실행중");
            //Thread.sleep(1); //최소한의 일시 정지상태를 만들어야함
            if (isInterrupted()) { //interrupt 가 실행되었는지 확인
                break;
            }
        }

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
