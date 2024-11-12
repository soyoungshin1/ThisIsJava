package ch11.sec03.exam01;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]" + value);
            } catch (NumberFormatException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (Exception e){
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            } // catch 여러개 작성할 수 있음
            // 대신에 넓은 범위가 아래로 오게 해야 됨
            // 1번 예외 이외 모든 예외는 2번으로 실행하겠다
        }
    }
}
