package no7;

import java.util.Arrays;
import java.util.Scanner;

public class No6JooMong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        int M = Integer.parseInt(sc.next());
        String b = sc.nextLine();

        String c = sc.nextLine();
        String material = sc.nextLine();
        System.out.println(a + ","  + b + "," + c + "," + N + ","  + M + "," + material);

        int start = 0;
        int end = 1;
        int sum = 0;
        int count = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(material.split("\\s+")[i]);
        }
        System.out.println("arr: " + Arrays.toString(arr));

        while (start < N - 1) {
            sum = arr[start] + arr[end];
            end++;
            if (sum == M) {
                count++;
            }
            if (end == N) {
                start++;
                end = start + 1;
            }
        }
        System.out.println("count: " + count);

        sc.close();
    }
}
