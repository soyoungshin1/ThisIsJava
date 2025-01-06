package ch18.sec06;

import java.io.*;

public class CharacterConvertorStreamExample {
    public static void main(String[] args) {
        try {
            write("문자 변환 스트림을 사용합니다");

            String str = read();
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void write(String str) throws IOException{
        OutputStream os = new FileOutputStream("C:/Temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8"); //문자스트림을 바이트스트림으로 변환
        writer.write(str);
        writer.flush();
        writer.close();
    }
    public static String read() throws IOException{
        /*InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is,"UTF-8"); //바이트스트림을 문자스트림으로 변환
        char[] data = new char[20];
        int num = reader.read(data);
        reader.close();
        String str = new String(data,0,num);
        return str;*/

        InputStream is = new FileInputStream("C:/Temp/test.txt");
        Reader reader = new InputStreamReader(is,"UTF-8"); //바이트스트림을 문자스트림으로 변환
        BufferedReader br = new BufferedReader(reader); //버퍼스트림 보조스트림 하나 더 추가
        String str = br.readLine();
        return str;
    }
}
