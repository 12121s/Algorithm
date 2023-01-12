package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class No_25501 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                isPalindrome(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);
        int isPalindrome = recursion(count, s, 0, s.length()-1);

        sb.append(isPalindrome).append(" ").append(count);
        System.out.println(sb);
    }
    public static int recursion(AtomicInteger count, String s, int l, int r){
        count.set(count.get() + 1);
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(count, s, l+1, r-1);
    }
}
