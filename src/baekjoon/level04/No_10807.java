package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class No_10807 {
    public static void printResult() {
        // 	memory: 17932(KB), time: 220(ms)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int find_v = sc.nextInt();

        IntStream intStream = Arrays.stream(array).filter (value -> value == find_v);
        System.out.println(intStream.count());
    }

    public static void printFasterResult() {
        // 	memory: 14424(KB), time: 128(ms)
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(sc.readLine());
            int[] array = new int[n];

            StringTokenizer st = new StringTokenizer(sc.readLine());
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            int find_v = Integer.parseInt(sc.readLine());

            IntStream intStream = Arrays.stream(array).filter (value -> value == find_v);
            System.out.println(intStream.count());

            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printNFasterResult() {
        // 	memory: 14244(KB), time: 124(ms)
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(sc.readLine());
            int[] array = new int[n];

            StringTokenizer st = new StringTokenizer(sc.readLine());
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            int find_v = Integer.parseInt(sc.readLine());
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] == find_v) count++;
            }
            System.out.println(count);

            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
