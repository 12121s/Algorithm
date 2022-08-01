package no11;

import java.util.*;
import java.util.logging.Logger;

public class No11Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(functionStack(N, A));
    }

    public static StringBuilder functionStack(int N, int[] A) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int num = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] >= num) {
                while (A[i] >= num) {
                    stack.push(num++);
                    answer.append("+\n");
                }
                stack.pop();
                answer.append("-\n");
            } else {
                int su = stack.pop();
                if (su > A[i]) return new StringBuilder("NO");
                else answer.append("-\n");
            }
        }
        return answer;
    }
}
