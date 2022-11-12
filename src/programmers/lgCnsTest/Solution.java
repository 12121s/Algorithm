package programmers.lgCnsTest;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("abc", "bcab");
    }
    public int solution(String ref, String track) {
        int answer = 0;
        ArrayList<String> combine = new ArrayList<>();

        for (int i = 0; i < ref.length(); i++) {
            for (int j = i; j < ref.length(); j++) {
                combine.add(ref.substring(i, j + 1));
            }
        }

        int point = 0;
        int max = 0;
        for (String s : combine) {
            for (int i = 0; i < track.length(); i++) {
                
            }
        }

        System.out.println(combine);

        return answer;
    }
}
