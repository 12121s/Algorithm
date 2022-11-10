package baekjoon.level02;

import java.util.Scanner;

public class DiceGame {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B || B == C || A == C) {
            System.out.println(1000 + ((A == B || A == C)? A : C) * 100);
        } else {
            System.out.println(Math.max(Math.max(A, B), C) * 100);
        }
    }

}
