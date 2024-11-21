package ch15.sec06.exam02;

//Queue
//FIFO (선입선출)
//넣을때 offer() 꺼낼때 poll()
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Massage> massageQueue = new LinkedList<>();

        //메세지 넣기
        massageQueue.offer(new Massage("sendMail", "홍길동"));
        massageQueue.offer(new Massage("sendSMS", "신용권"));
        massageQueue.offer(new Massage("sendKakaotalk", "김자바"));

        //메세지를 하나씩 꺼내기
        while (massageQueue.isEmpty()){
            Massage massage = massageQueue.poll();
            switch (massage.command){
                case "sendMail":
                    System.out.println(massage.to + "님에게 메일을 보냅니다");
                    break;
                case  "sendSMS":
                    System.out.println(massage.to + "님에게 SMS 를 보냅니다");
                    break;
                case  "sendKakaotalk":
                    System.out.println(massage.to + "님에게 카카오톡을 보냅니다");
                    break;
            }
        }
    }
}
