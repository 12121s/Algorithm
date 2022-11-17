package baekjoon.level11;

import java.util.Scanner;

public class No_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }
    public static int factorial(int N) {
        if (N == 0 || N == 1) return 1;
        else return N * factorial(N-1);
    }
}
