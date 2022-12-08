package programmers.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_TargetNumber {

    public static void main(String[] args) {
        Solution_TargetNumber st = new Solution_TargetNumber();

        System.out.println(st.solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(st.solution(new int[]{4, 1, 2, 1}, 4));
    }

    int answer;
    int target;
    int[] numbers;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        return answer;
    }

    public void dfs(int index, int sum) {
        // 탈출 조건
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        // 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
