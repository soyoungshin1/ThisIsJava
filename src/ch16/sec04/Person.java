package ch16.sec04;

import ch16.sec04.Calcurable;

public class Person {
    public void action(Calcurable calculable){
        //return 값이 있다
        double result = calculable.calc(10,4);
        System.out.println("결과: " + result);
    }
}
