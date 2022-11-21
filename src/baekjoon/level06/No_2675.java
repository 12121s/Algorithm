package baekjoon.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2675 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int count = Integer.parseInt(st.nextToken());
                String word = st.nextToken();

                StringBuilder sb = new StringBuilder();
                for(char ch : word.toCharArray()) {
                    sb.append(String.valueOf(ch).repeat(count));
                }
                System.out.println(sb);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
