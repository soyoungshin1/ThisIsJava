package ch17.sec07.exam01;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) { //Comparebl을 구현하는 클래스이면 compareTo() 재정의 해야함
        return Integer.compare(score, o.score);
    }
}
