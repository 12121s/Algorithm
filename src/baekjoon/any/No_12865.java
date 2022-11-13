package baekjoon.any;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No_12865 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N_amount = Integer.parseInt(st.nextToken()), K_gram = Integer.parseInt(st.nextToken());

            int[][] bag = new int[N_amount + 1][2];
            for (int i = 1; i <= N_amount; i++) {
                st = new StringTokenizer(br.readLine());
                bag[i][0] += bag[i-1][0] + Integer.parseInt(st.nextToken());
                bag[i][1] += bag[i-1][1] + Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.deepToString(bag));

            HashMap<Integer, Integer> values = new HashMap<>();
            int max_value = 0;
            for (int i = 1; i <= N_amount; i++) {
                int j = i;
                while (j <= N_amount) {
                    int k_combine = bag[j][0] - bag[i - 1][0];
                    int v_combine = bag[j][1] - bag[i - 1][1];

                    if (k_combine > K_gram) break;
                    values.put(k_combine, bag[j][1] - bag[i - 1][1]);
                    if (max_value < v_combine) max_value = v_combine;
                    j++;
                }
            }
            System.out.println(values.entrySet());
            System.out.println(max_value);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
