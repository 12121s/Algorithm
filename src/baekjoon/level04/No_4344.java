package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_4344 {
    /**
     * 5
     * 5 50 50 70 80 100
     * 7 100 95 90 80 70 60 50
     * 3 70 90 80
     * 3 70 90 81
     * 9 100 99 98 97 96 95 94 93 91
     * */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                double avg = 0f;
                double sum = 0f;
                double overAvg = 0f;

                StringTokenizer st = new StringTokenizer(br.readLine());
                int scoreCnt = Integer.parseInt(st.nextToken());
                double[] scoreArr = new double[scoreCnt];

                for (int j = 0; j < scoreCnt; j++) {
                    scoreArr[j] = Integer.parseInt(st.nextToken());
                    sum += scoreArr[j];
                }
                avg = sum / scoreCnt;

                for (double score : scoreArr) {
                    if (score > avg) {
                        overAvg++;
                    }
                }
                System.out.printf("%.3f%%\n", overAvg / scoreCnt * 100.0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
