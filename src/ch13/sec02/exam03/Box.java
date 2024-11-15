package ch13.sec02.exam03;

public class Box <T>{
    public T content;

    //Box 의 내용물이 같은지 비교하는 메소드
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content); //기본적으로 Object 타입. Object 의 equals() 메소드 사용
        return result;
    }

}
