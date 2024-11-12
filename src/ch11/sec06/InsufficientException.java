package ch11.sec06;

//사용자 정의 예외
//만드는 법 법칙이라 아래처럼 하면 됨.

public class InsufficientException extends Exception{
    public InsufficientException(){

    }
    public InsufficientException(String message){
        super(message);
    }
}
