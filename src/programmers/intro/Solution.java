package programmers.intro;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] sample01 = {1, 2};
        int[] sample02 = {3, 6};
        int[] sample03 = {11, 7};

        System.out.println(solution(sample01));
        System.out.println(solution(sample02));
        System.out.println(solution(sample03));
    }

    public static int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        // 가장 긴 변이 max인 경우 max - min < c <= max
        answer += sides[0];

        // 가장 긴 변이 나머지 변인 경우 (max + min) > c > max
        answer += (sides[0] - 1);

        return answer;
    }
}
