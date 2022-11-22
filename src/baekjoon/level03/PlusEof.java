package baekjoon.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusEof {
    public static void printResult() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = "";

            while ((input = br.readLine()) != null && !input.isEmpty()) {
                StringTokenizer st = new StringTokenizer(input);
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                System.out.println(a + b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
