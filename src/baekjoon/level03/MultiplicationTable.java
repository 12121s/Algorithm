package baekjoon.level03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(no + " * " + i + " = " + no * i);
        }
    }
}
