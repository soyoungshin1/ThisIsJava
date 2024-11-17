package ch14.sec08;

//데몬스레드로 설정하면 메인스레드가 종료될때 같이 종료됨
public class DemonExample {
    public static void main(String[] args) {
        AutoSaveThread thread = new AutoSaveThread();
        thread.setDaemon(true); //데몬스레드로 설정
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("메인스레드 종료");

    }
}
