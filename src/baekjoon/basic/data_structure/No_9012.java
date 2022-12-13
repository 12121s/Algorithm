package baekjoon.basic.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9012 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String ps = br.readLine();
                String isValid = "";

                Stack<Character> stack = new Stack<>();
                for (char ch : ps.toCharArray()) {
                    if (ch == '(') {
                        stack.push(ch);
                    } else if (ch == ')') {
                        if (stack.isEmpty())
                            isValid = "NO";
                        else stack.pop();
                    }
                }
                if (isValid.equals(""))
                    isValid = stack.isEmpty()? "YES" : "NO";

                System.out.println(isValid);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
