package baekjoon.level04;

import java.io.*;
import java.util.StringTokenizer;

public class No_10871 {
    public static void printNFasterResult() {
        // 	memory: 18024(KB), time: 212(ms)
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] array = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                if (array[i] < x) bw.write(array[i] + " ");
            }
            bw.flush();

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printMFasterResult() {
        // 	memory: 15632(KB), time: 172(ms)
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] array = new int[n]; // 사실 로직적으로 배열 생성 안하고 입력받는 값마다 x보다 작은지 비교하는 로직이 더 빠름.

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (array[i] < x) sb.append(array[i]).append(' ');
            }

            System.out.println(sb);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
