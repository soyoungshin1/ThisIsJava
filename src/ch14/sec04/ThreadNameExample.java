package ch14.sec04;

//getName() = 스레드 이름 얻어오기
//setName("바꿀 이름") = 스레드 이름 변경
public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run(){
                    System.out.println(getName() + " 실행");
                }
            };
            threadA.start();
        }
        Thread chatThread = new Thread(){
            @Override
            public void run(){
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("chat-thread"); //스레드 이름 바꿔야하는 경우 먼저 바꿔놓아야함
        chatThread.start();
    }
}
