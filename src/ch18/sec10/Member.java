package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    //serialVersionUID 직렬화하는 클래스와 역직렬화하는 클래스의 클래스 내용이 다르더라도
    //같은 상수값을 가지고 있으면 됨.
    private static final long serialVersionUID = -622284561026719240L;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
