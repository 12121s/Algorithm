package baekjoon.basic.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1874 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int[] stackArr = new int[n];
            for (int i = 0; i < n; i++) {
                stackArr[i] = Integer.parseInt(br.readLine());
            }
            StringBuilder sb = new StringBuilder();

            int no = 1, x = 0;
            while (x < stackArr.length) {
                if (stackArr[x] == no) {
                    sb.append("-\n");
                    x++;
                    no--;
                } else {
                    sb.append("+\n");
                    no++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
