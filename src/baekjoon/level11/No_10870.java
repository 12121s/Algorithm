package baekjoon.level11;

import java.util.Scanner;

public class No_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }
    public static int fibonacci(int N) {
        if (N == 0) return 0;
        else if (N == 1) return 1;
        else return fibonacci(N-1) + fibonacci(N-2);
    }
}
