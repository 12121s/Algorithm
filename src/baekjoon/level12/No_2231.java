package baekjoon.level12;

import java.util.Arrays;
import java.util.Scanner;

public class No_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(searchDivSum(N));
    }

    public static int searchDivSum(int N) {
        for (int i = 1; i <= N; i++) {
            int length = (int) (Math.log10(i) + 1);
            int[] piece = new int[length];
            for (int j = 1; j <= length; j++) {
                piece[j - 1] = (int) ((i % Math.pow(10, j)) / Math.pow(10 ,j - 1));
            }
            if(N == Arrays.stream(piece).sum() + i)
                return i;
            // System.out.println(Arrays.toString(piece));
        }
        return 0;
    }
}
