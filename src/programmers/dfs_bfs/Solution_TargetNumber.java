package programmers.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_TargetNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(solution(new int[]{4, 1, 2, 1}, 4));
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        List<Integer> currentList = Arrays.asList(numbers[0], -numbers[0]);

        for (int number : numbers) {
            System.out.println("number: " + number);

            List<Integer> nextList = new ArrayList<>();
            for (int num : currentList) {
                System.out.println("num: " + num);

                System.out.println("num + number: " + (num + number));
                nextList.add(num + number);

                System.out.println("num - number: " + (num - number));
                nextList.add(num - number);
            }
            currentList = nextList;

            for (int num : currentList) {
                if (num == target) answer += 1;
            }
        }

        return answer;
    }
}
