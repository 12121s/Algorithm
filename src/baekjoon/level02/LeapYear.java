package baekjoon.level02;

import java.util.Scanner;

public class LeapYear {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
