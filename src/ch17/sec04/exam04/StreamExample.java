package ch17.sec04.exam04;


//파일경로로부터 스트림 얻기
//리턴타입 Stream<String>
//메소드 Files.lines(Path, Charset 문자형식)
//리소스 텍스트 파일
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Path path = null;
        try {
            path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
        } catch (URISyntaxException e) {
            
        }
        Stream<String> stream = null;
        try {
            stream = Files.lines(path, Charset.defaultCharset());
        } catch (IOException e) {

        }
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
