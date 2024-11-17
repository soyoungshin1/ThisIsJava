package ch12.sec05;

import lombok.SneakyThrows;

import java.util.Arrays;

public class BytesToStringExample {
    @SneakyThrows
    public static void main(String[] args) {
        String data = "자바";

        //String -> byte 배열 (기본:UTF-8 인코딩)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1: " + Arrays.toString(arr1));

        //byte -> String (기본: UTF-8 디코딩)
        String str1 = new String(arr1);
        System.out.println("str1: " + str1);

        //String -> byte 배열 (EUC-KR 인코딩)
        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2: " + Arrays.toString(arr2));

        //byte -> String (기본: UTF-8 디코딩)
        String str2 = new String(arr2,"EUC-KR");
        System.out.println("str2: " + str2);
    }
}
