package ch14.sec08;

public class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break; //예외가 발생하면 멈추고 while 문을 빠져나간다
            }
            save(); // 1초마다 save() 실행
        }
    }
}
