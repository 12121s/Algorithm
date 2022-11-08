package baekjoon.level01;

import java.util.Scanner;

/** (세 자리 수) × (세 자리 수) */
public class Digits3Multiply {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * (num2 % 100/10));
        System.out.println(num1 * (num2 % 1000/100));
        System.out.println(num1 * num2);
    }

}
