package programmers.lv01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_NearestIdenticalLetter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("bananas")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> letterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letterMap.get(letter) != null) { // 이전에 같은 문자 존재
                answer[i] = i - letterMap.get(letter); // 현재 위치 - 이전 문자 위치
            } else answer[i] = -1;
            letterMap.put(s.charAt(i), i); 
        }

        return answer;
    }
}
