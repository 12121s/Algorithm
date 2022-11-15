package baekjoon.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2559 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] temp_arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                temp_arr[i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(maxTempSum(N, K, temp_arr));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int maxTempSum(int N, int K, int[] temp_arr) {
        int max_sum_temp = - 100 * K;
        int[] sum_arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            sum_arr[i + 1] = temp_arr[i] + sum_arr[i];
        }

        for (int i = 0; i + K <= N ; i++) {
            int sum =  sum_arr[i + K] - sum_arr[i];
            if (max_sum_temp < sum)
                max_sum_temp = sum;
        }

        return max_sum_temp;
    }
}
