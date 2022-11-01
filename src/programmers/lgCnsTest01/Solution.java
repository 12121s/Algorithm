package programmers.lgCnsTest01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] input01 = {{1,4}, {3,4}, {3,10}};
        int[][] input02 = {{1,1}, {2,2}, {1,2}};

        Solution solution = new Solution();
        System.out.println("input01: " + Arrays.toString(solution.my_solution(input01)));
        System.out.println("input02: " + Arrays.toString(solution.my_solution(input02)));
    }

    public int[] my_solution(int[][] v) {
        int[] answer = {};

        int x_temp = 0, x_same = 0;
        int y_temp = 0, y_same = 0;

        for(int i = 0; i < v.length; i++) {
            for(int j = 0; j < v[i].length; j++) {
                if (j == 0) {
                    if (x_temp == v[i][j]) {
                        x_same = v[i][j];
                    } else {
                        x_temp = v[i][j];
                    }
                } else if (j == 1) {
                    if (y_temp == v[i][j]) {
                        y_same = v[i][j];
                    } else {
                        y_temp = v[i][j];
                    }
                }
            }
        }

        int x_answer = 0, y_answer = 0;
        for(int i = 0; i < v.length; i++) {
            for(int j = 0; j < v[i].length; j++) {
                if (j == 0 && x_same != v[i][j]) {
                    x_answer = v[i][j];
                } else if (j == 1 && y_same != v[i][j]) {
                    y_answer = v[i][j];
                }
            }
        }

        System.out.println("x_answer: " + x_answer + ", y_answer: " + y_answer);

        return answer;
    }
}
