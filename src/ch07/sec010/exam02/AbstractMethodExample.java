package ch07.sec010.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        //객체 생성
        //메소드 호출
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());


    }

    private static void animalSound(Animal animal) {
    animal.sound();
    }
}
