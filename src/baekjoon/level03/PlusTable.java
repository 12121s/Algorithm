package baekjoon.level03;

import java.util.Scanner;

public class PlusTable {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
