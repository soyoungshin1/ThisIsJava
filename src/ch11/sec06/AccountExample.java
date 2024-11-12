package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 메소드를 호출하는 곳에서 try - catch 구문 넣어준다
        try {
            account.withdraw(20000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        System.out.println("예금액: " + account.getBalance());
    }

}
