package ch08.sec08;
//다중 인터페이스 구현
public class SmartTelevision implements RemoteControl, Searchable{

    // 여러개의 인터페이스를 받을 때는 그 안에 있는 추상 메소드 전부 다 재정의 해야함
    @Override
    public void turnOn() {
        System.out.println("tv 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("tv 를 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
