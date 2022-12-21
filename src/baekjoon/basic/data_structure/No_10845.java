package baekjoon.basic.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No_10845 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                String command = br.readLine();

                if (command.contains("push")) {
                    int element = Integer.parseInt(command.substring(command.indexOf(" ") + 1));
                    queue.add(element);
                } else if (command.contains("pop")) {
                    System.out.println(queue.isEmpty()? -1 : queue.pop());
                } else if (command.contains("size")) {
                    System.out.println(queue.size());
                } else if (command.contains("empty")) {
                    System.out.println(queue.isEmpty()? 1 : 0);
                } else if (command.contains("front")) {
                    System.out.println(queue.isEmpty()? -1 : queue.peek());
                } else if (command.contains("back")) {
                    System.out.println(queue.isEmpty()? -1 : queue.peek());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
