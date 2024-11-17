package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택번호: ");

        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1; //1~46까지의 정수
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        //당첨번호
        int[] winningNumber = new  int[6];
        random = new Random(5); //seed 값이 선택번호의 seed 값과 같으면 같은 당첨으로 나옴
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        //당첨여부
        Arrays.sort(selectNumber); // 배열을 오름차순으로 정렬
        Arrays.sort(winningNumber);

        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨여부: ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다");
        } else {
            System.out.println("당첨되지 않았습니다");
        }
    }
}
