package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_10818 {

    public static void printBuilderResult() {
        // 	memory: 14244(KB), time: 124(ms)
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            int min = 1000000, max = -1000000;
            for (int i = 0; i < n; i++) {
                int newX = Integer.parseInt(st.nextToken());

                if (min > newX) {
                    min = newX;
                }
                if (max < newX) {
                    max = newX;
                }
            }

            sb.append(min).append(' ').append(max);
            System.out.println(sb);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printLoopResult() {
        // 	memory: 14244(KB), time: 124(ms)
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 1000000, max = -1000000;
            for (int i = 0; i < n; i++) {
                int newX = Integer.parseInt(st.nextToken());
                if (min > newX) {
                    min = newX;
                }
                if (max < newX) {
                    max = newX;
                }
            }
            System.out.println(min + " " + max);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printSortResult() {
        // 	memory: 14244(KB), time: 124(ms)
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array);
            System.out.println(array[0] + " " + array[array.length - 1]);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
