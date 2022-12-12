package baekjoon.basic.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9093 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String sentence = br.readLine();

                Stack<Character> stack = new Stack<>();
                StringBuffer sb = new StringBuffer();

                for (char ch : sentence.toCharArray()) {
                    if (ch == ' ') {
                        while (!stack.isEmpty()) {
                            sb.append(stack.pop());
                        }
                        sb.append(" ");
                    } else {
                        stack.push(ch);
                    }
                }

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                System.out.println(sb);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
