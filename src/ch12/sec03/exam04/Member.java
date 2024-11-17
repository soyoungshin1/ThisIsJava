package ch12.sec03.exam04;
//레코드 선언
//클래스 선언에 private final 필드, 생성자, Getter 메소드, hashCode(), equals() , toString() 재정의 자동으로 추가됨
public record Member(String id, String name, int age) {
}
