package doit.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4PartSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bfReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[][] S = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            bfReader.readLine(); // 앞의 엔터를 스킵해주는 역할
            st = new StringTokenizer(bfReader.readLine()); // 숫자 문자열을 읽는 역할 (ex) 2'r'3'r'4'r'5' 만 읽음. \n ->은 위에서 스킵해줘야함.
            for (int j = 1; j <= N; j++) {
                S[i][j] += S[i][j-1] + S[i-1][j] - S[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        bfReader.readLine();
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(bfReader.readLine());
            int qx = Integer.parseInt(st.nextToken());
            int qy = Integer.parseInt(st.nextToken());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            System.out.println(S[px][py] - S[qx-1][py] - S[px][qy-1] + S[qx-1][qy-1]);
        }
        bfReader.close();
    }
}
