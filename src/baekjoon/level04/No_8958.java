package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8958 {
    /**
     * 5
     * OOXXOXXOOO
     * OOXXOOXXOO
     * OXOXOXOXOXOXOX
     * OOOOOOOOOO
     * OOOOXOOOOXOOOOX
     * */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                int answer = 0;
                int prevCount = 0;

                String oxScores = br.readLine();
                for (int j = 0; j < oxScores.length(); j++) {
                    char ox = oxScores.charAt(j);
                    if (ox == 'O') {
                        answer += ++prevCount;
                    } else prevCount = 0;
                }
                System.out.println(answer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
