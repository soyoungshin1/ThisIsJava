package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //K 는 Tv로, M 은 String 으로 대체
        Product<Tv, String> product1 = new Product<>();

        //Setter 매개값은 반드시 Tv와 String 을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트tv");

        //Getter 리턴값은 Tv와 String 이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //K 는 Car , M 은 String 으로 대체
        Product<Car, String> product2 = new Product<>();

        //Setter 매개값은 반드시 Car 와 String 을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        //Getter 리턴값은 Car 와 String 이 됨
        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
