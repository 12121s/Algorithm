package baekjoon.level02;

import java.util.Scanner;

public class EarlierAlarm {

    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            M = M + 60 - 45;
            if (H - 1 < 0) {
                H = H + 24 - 1;
                System.out.println(H + " " + M);
            } else {
                H = H - 1;
                System.out.println(H + " " + M);
            }
        } else {
            M = M - 45;
            System.out.println(H + " " + M);
        }
    }

    public static void printShortResult() {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt(), M = s.nextInt();
        System.out.print(M < 45 ? (H + 23) % 24 + " " + (M + 15) : H + " " + (M - 45));
    }
}
