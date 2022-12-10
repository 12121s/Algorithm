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
                    int element = Integer.parseInt(command.substring(command.length() -1));
                    stack.push(element);
                } else if (command.contains("pop")) {
                    
                } else if (command.contains("size")) {

                } else if (command.contains("empty")) {

                } else if (command.contains("top")) {
                    if (stack.isEmpty())
                        System.out.println(-1);
                    else System.out.println(stack.lastElement());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
