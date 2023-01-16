package baekjoon.level03;

import java.io.*;
import java.util.StringTokenizer;

public class No_10952 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if (A == 0 && B == 0) break;
                else System.out.println(A+B);
            }

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
