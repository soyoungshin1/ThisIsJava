package ch16.sec01;

@FunctionalInterface // 인터페이스가 함수형 인터페이스인지 검증. 추상 메소드 1개
public interface Calculable {
    //추상 메소드
    void calculate(int x, int y);
}
