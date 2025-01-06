package ch18.sec03.exam03;

//파일 복사하기
import java.io.*;

public class CopyExample {
    public static void main(String[] args) {

        String originFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        //자동 Resource 닫기
        try(InputStream is = new FileInputStream(originFileName);
            OutputStream os = new FileOutputStream(targetFileName)){

            byte[] data = new byte[1024];
            while (true){
                int num = is.read(data);
                if (num == -1) break;

                os.write(data, 0, num); //data 배열을 0부터 num 까지

            }
            os.flush();
            System.out.println("복사가 잘 되었습니다");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}