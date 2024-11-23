package ch16.sec04;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x,y)->{
            //return 값이 있을 때 람다식 내에서도 return 문이 있어야함
            double result = x+ y;
            return result;
        });
        //람다식에 {} 가 없으면 x+y 가 return 값임
        person.action((x , y) -> x + y);
        //아래 sum() 메소드를 활용한 람다식
        person.action(((x, y) -> sum(x, y)));
    }
    public static double sum(double x, double y){
        return (x + y);
    }
}
