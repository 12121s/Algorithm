package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2562 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int max = 0;
            int index = 0;
            for (int i = 0; i < 9; i++) {
                int num = Integer.parseInt(br.readLine());
                if (max < num) {
                    max = num;
                    index = i;
                }
            }

            System.out.println(max);
            System.out.println(index + 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
