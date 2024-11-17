package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {

        //버튼 객체 생성
        Button btnOk = new Button();
        Button btnCancel = new Button();



        //버튼 객체에 ClickListener 구현 객체 주입
        //명시적 클래스 나 객체 만들지 않고
        //익명 구현 객체를 만들어서 넣는다
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ok버튼이 클릭되었습나다");
            }
        });
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("cancel 버튼이 클릭되었습니다");
            }
        });

        //버튼 클릭하기
        btnOk.click();
        btnCancel.click();




    }
}
