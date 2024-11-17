package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //작업1
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
        for (int i = 0; i < 5 ; i++) {
            toolkit.beep(); //소리 발생
            try {
                Thread.sleep(500); // 0.5 초간 일시정지
            } catch (InterruptedException e) {

            }

        }
        //작업2
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
