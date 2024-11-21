package ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //hashCode() 재정의

    @Override
    public int hashCode() {
        return name.hashCode() + age; //name 과 age 가 같으면 동일한 hashCode 가 리턴됨

    }
    //equals() 재정의

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.equals(name) && (target.age==age);
        //name 과 age 값이 같으면 true 가 리턴됨
        } else {
            return false;
        }
    }
}
