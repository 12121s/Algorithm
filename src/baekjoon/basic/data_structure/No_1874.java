package baekjoon.basic.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_1874 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int[] stackArr = new int[n];
            for (int i = 0; i < n; i++) {
                stackArr[i] = Integer.parseInt(br.readLine());
            }

            int no = 1, x = 0;
            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            sb.append("+\n");
            stack.push(no);
            while (x < stackArr.length && no < stackArr.length + 1) {
                if (!stack.isEmpty() && stackArr[x] == stack.peek()) {
                    sb.append("-");
                    stack.pop();
                    x++;
                    if (x != stackArr.length) sb.append("\n");
                } else {
                    sb.append("+");
                    stack.push(++no);
                    if (no != stackArr.length + 1) sb.append("\n");
                }
            }
            if (!stack.isEmpty()) {
                sb = new StringBuilder();
                sb.append("NO");
            }

            System.out.println(sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
