package baekjoon.level03;

import java.io.*;
import java.util.Scanner;

public class PrintStar {
    public static void printResult() {
        try {
            StringBuilder sb = new StringBuilder();
            int count = System.in.read();
            System.out.println(count);
            count -= '0';
            System.out.println(count);
            for (int i = count, j = 1; i > 0; i--) {
                sb.append("*".repeat(j++)).append("\n");
            }
            System.out.println(sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printShortResult() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
