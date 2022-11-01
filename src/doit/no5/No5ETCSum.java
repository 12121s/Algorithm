package doit.no5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5ETCSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bfReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        bfReader.readLine();
        st = new StringTokenizer(bfReader.readLine());
        int sum = 0;
        long count = 0;
        long[] C = new long[M];

        // 합 배열 생성 & 합 배열의 모든 값을 M으로 나머지 연산 수행하면서 개수 세기
        for (int i = 1; i <= N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            C[sum]++;
        }

        count = C[0];
        for (int i = 0; i < M; i++) {
            count = count + (C[i] * (C[i] - 1) / 2);
        }
        System.out.println(count);
        bfReader.close();
    }
}
