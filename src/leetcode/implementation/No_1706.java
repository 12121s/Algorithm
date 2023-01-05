package leetcode.implementation;

import java.util.Arrays;

public class No_1706 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        findBall(new int[][]{
                                {1, 1, 1, -1, -1},
                                {1, 1, 1, -1, -1},
                                {-1, -1, -1, 1, 1},
                                {1, 1, 1, 1, -1},
                                {-1, -1, -1, -1, -1}
                        })
                ));
        System.out.println(
                Arrays.toString(
                        findBall(new int[][]{
                                {1,1,1,1,1,1},
                                {-1,-1,-1,-1,-1,-1},
                                {1,1,1,1,1,1},
                                {-1,-1,-1,-1,-1,-1}
                        })
                ));
        System.out.println(
                Arrays.toString(
                        findBall(new int[][]{
                                {1,1,1,1,1},
                                {-1,-1,-1,1,1},
                                {-1,-1,1,-1,1},
                                {1,1,-1,1,-1}
                        })
                ));

        System.out.println(
                Arrays.toString(
                        findBall(new int[][]{
                                {-1,1,-1,-1,-1,-1,-1,-1,1,-1, -1,-1,-1,1,1,-1,-1,-1,1,1}
                        })
                ));

        System.out.println(
                Arrays.toString(
                        findBall(new int[][]{
                                {1,-1,-1,1,-1,1,1,1,1,1,-1,1,1,1,1,1,1,-1,-1,-1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,-1,1,-1,1,1,-1,-1,-1,-1,-1,1},
                                {-1,1,1,1,-1,-1,-1,-1,1,1,1,-1,-1,-1,1,-1,-1,1,1,1,1,1,1,-1,1,-1,-1,-1,-1,-1,1,-1,1,-1,-1,-1,-1,1,1,-1,1,1},
                                {1,-1,-1,-1,-1,1,-1,1,1,1,1,1,1,1,-1,1,-1,-1,-1,1,-1,-1,1,-1,1,-1,1,-1,-1,1,-1,1,-1,1,1,-1,-1,1,1,-1,1,-1}
                        })
                ));
    }

    public static int[] findBall(int[][] grid) {
        int colSize = grid[0].length;

        int[] ballPosition = new int[colSize];

        for (int col = 0; col < colSize; col++) {
            ballPosition[col] = findPosition(grid, 0, col);
        }

        return ballPosition;
    }

    /**
     * dfs 방식(?)
     * */
    public static int findPosition(int[][] grid, int row, int col) {
        if (row == grid.length) return col;
        if (checkPosition(grid.length, grid[0].length, row, col)) {
            if (grid[row][col] == 1) { // 오른쪽으로 흐르는 궤적인 경우
                if (checkPosition(grid.length, grid[0].length, row, col+1)
                        && grid[row][col+1] == 1)
                    return findPosition(grid, row+1, col+1); // 다음 궤적도 오른쪽이어야 아래로 흐른다.
            } else { // 왼쪽으로 흐르는 궤적
                if (checkPosition(grid.length, grid[0].length, row, col-1)
                        && grid[row][col-1] == -1)
                    return findPosition(grid, row+1, col-1); // 다음 궤적도 왼쪽이어야 아래로 흐른다.
            }
        }
        return -1;
    }

    /**
     * 공의 위치가 그리드의 크기를 넘지 않는지 체크
     * */
    public static boolean checkPosition(int rowSize, int colSize, int row, int col) {
        return rowSize > row && colSize > col && col >= 0 && row >= 0;
    }


    /*public static int[] findBall(int[][] grid) {
        int rowLength = grid[0].length;
        int[] ballPosition = new int[rowLength];

        IntStream.rangeClosed(1, rowLength).forEach(i -> ballPosition[i - 1] = i -1);

        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];

            int prevIndex = 0;
            int prevValue = 0;

            for (int j = 0; j < row.length; j++) {
                int current = row[j];

                if (i == 0 && j == 0 && current < 0)
                    ballPosition[j] = -1;
                else if (i == 0 && j == row.length - 1 && current > 0)
                    ballPosition[j] = -1;
                else {
                    if (ballPosition[j] >= 0) {
                        if (prevValue * current == -1 && current < 0 && prevIndex == j - 1) {
                            ballPosition[prevIndex] = -1;
                            ballPosition[j] = -1;
                        } else {
                            ballPosition[j] += current;
                            prevIndex = j;
                        }
                        // 비교할 값 정보 할당
                        prevValue = current;
                    }
                }
            }
             System.out.println("row: "+ Arrays.toString(ballPosition));
        }

        return ballPosition;
    }*/
}
