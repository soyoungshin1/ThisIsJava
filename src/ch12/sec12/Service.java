package ch12.sec12;

import java.lang.reflect.Method;

public class Service {
    public static Method[] getDeclasredMethods() {
        return null;
    }

    @PrintAnnotation
    public void method1(){
        System.out.println("실행내용");
    }
    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행내용2");
    }
    @PrintAnnotation(value = "#", number = 20)
    public void method3(){
        System.out.println("실행내용3");
    }
}
