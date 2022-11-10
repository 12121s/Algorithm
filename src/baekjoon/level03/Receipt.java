package baekjoon.level03;

import java.util.Scanner;

public class Receipt {
    public static void printResult() {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int total = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < total; i++) {
            int price = sc.nextInt(), count = sc.nextInt();
            sum += price * count;
        }
        System.out.println(amount == sum? "Yes": "No");
    }

    public static void printShortResult() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
