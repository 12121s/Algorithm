package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class No_3052 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, Integer> numVar = new HashMap<>();

            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(br.readLine());
                numVar.merge(num % 42, 1, Integer::sum);
            }

            System.out.println(numVar.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
