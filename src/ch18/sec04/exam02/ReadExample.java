package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        Reader reader = null;
        
        //1문자씩 읽기 
        try {
            reader = new FileReader("C:/Temp/test.txt");

            while (true){
                int data = reader.read(); //1문자를 읽음
                if (data == -1)break; //파일을 다 읽으면 while 문 종료
                System.out.println((char) data); //읽은 문자 출력
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100]; //읽은 문자를 저장할 배열 생성
            while (true){ 
                int num = reader.read(data); //읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
                if (num == -1)break; //num 이 -1 이 되면 while 문 종료
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]); //읽은 문자 수만큼 출력
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        
    }

