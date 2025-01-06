package ch18.sec03.exam01;

//바이트 읽기
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {

        InputStream is = null;
        try {
            is = new FileInputStream("C:/Temp/test.db");
            while (true){
                int data = is.read(); // 1byte 씩 읽는다
                if (data == -1) break;; //더 이상 읽을 수 없다면 -1을 리턴한다. -1을 리턴하면 break
                System.out.println(data);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {

            }
        }
    }
}
