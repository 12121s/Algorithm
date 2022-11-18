package baekjoon.level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1712 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int fixedCost = Integer.parseInt(st.nextToken());
            int variableCost = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());

            System.out.println(breakevenPoint(fixedCost, variableCost, price));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int breakevenPoint(int A, int B, int C) {
        if (B >= C) return -1;
        return A / (C - B) + 1;
    }
}
