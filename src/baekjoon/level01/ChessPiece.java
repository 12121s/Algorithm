package baekjoon.level01;

import java.util.Scanner;

public class ChessPiece {

    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int piece = sc.nextInt();
            System.out.print(chess[i] - piece + " ");
        }
    }

}
