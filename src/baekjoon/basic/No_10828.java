package baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_10828 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                String command = br.readLine();

                if (command.contains("push")) {
                    int element = Integer.parseInt(command.substring(command.indexOf(" ") + 1));
                    stack.push(element);
                } else if (command.contains("pop")) {
                    System.out.println(stack.isEmpty()? -1 : stack.pop());
                } else if (command.contains("size")) {
                    System.out.println(stack.size());
                } else if (command.contains("empty")) {
                    System.out.println(stack.isEmpty()? 1 : 0);
                } else if (command.contains("top")) {
                    System.out.println(stack.isEmpty()? -1 : stack.peek());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
