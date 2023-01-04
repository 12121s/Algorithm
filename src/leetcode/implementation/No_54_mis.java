package leetcode.implementation;

import java.util.ArrayList;
import java.util.List;

public class No_54_mis {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int order = (i % 2 == 0) ? 0 : matrix[i].length - 1;
            for (int j = 0; j < matrix[i].length; j++) {
                answer.add(matrix[i][Math.abs(order - j)]);
            }
        }
        return answer;
    }
}
