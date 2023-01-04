package leetcode.implementation;

import java.util.ArrayList;
import java.util.List;

public class No_54 {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        // 기준점
        int top = 0; int down = matrix.length - 1;
        int left = 0; int right = matrix[0].length - 1;

        // 방향 0: →, 1: ↓, 2: ←, 3: ↑
        int direction = 0;

        // 상하좌우 기준점이 만날때까지 반복
        while (top <= down && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    answer.add(matrix[top][i]);
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++)
                    answer.add(matrix[i][right]);
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--)
                    answer.add(matrix[down][i]);
                down--;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--)
                    answer.add(matrix[i][left]);
                left++;
            }
            direction = (direction + 1) % 4;
        }

        return answer;
    }
}
