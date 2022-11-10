package baekjoon.level02;

import java.util.Scanner;

public class OvenAlarm {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), M = sc.nextInt();
        int time = sc.nextInt();

        System.out.println((M + time >= 60)? (((H + (M + time)/60 + 24) % 24) + " " + ((M + time) % 60)) : (H + " " + (M + time)));
    }

    public static void printShortResult() {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt(), m = s.nextInt() + s.nextInt();

        System.out.print((h+m/60)%24 + " " + m%60);
    }
}
