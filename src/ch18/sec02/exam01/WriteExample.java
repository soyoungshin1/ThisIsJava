package ch18.sec02.exam01;

//바이트 출력
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        OutputStream os =null;
        try {
            os = new FileOutputStream("C:/Temp/test.db");

            byte a = 10;
            os.write(a);
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {

            }
        }
    }
}
