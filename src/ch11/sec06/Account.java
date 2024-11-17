package ch11.sec06;

public class Account {
    //필드
    private long balance;

    //생성자 (없어도 컴파일시 자동 생성됨)
    public Account(){

    };

    //Getter
    public long getBalance(){
        return balance;
    }
    //입금 메소드
    public void deposit(int money){
        balance += money;
    }
    //출금 메소드
    public void withdraw(int money) throws InsufficientException{
        if (balance < money) {
            throw new InsufficientException("잔고 부족: "+ (money-balance) + "모자람");
        }
        balance -= money;
    }
}
