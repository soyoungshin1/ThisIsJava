package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", " 안드로이드");

        String strObj1 = myPhone.toString();
        System.out.println(strObj1);
        // 재정의 하지 않으면 
        //ch12.sec03.exam03.SmartPhone@119d7047 이렇게 출력된다
        System.out.println(myPhone);
    }
}
