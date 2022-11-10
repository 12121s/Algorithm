package baekjoon.level03;

import java.util.Scanner;

public class PlusCycle {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 최초 숫자

        int digit1 = num / 10; // 10의 자릿수
        int digit2 = num % 10; // 1의 자릿수

        int result, new_num, count = 0; // 자릿수 합, 새로 조합한 숫자, 연산 횟수

        while (true) {
            count++;
            result = digit1 + digit2;

            new_num = digit2 * 10 + result % 10;
            if (num == new_num) {
                System.out.println(count);
                return;
            } else {
                digit1 = new_num / 10;
                digit2 = new_num % 10;
            }
        }
    }
}
