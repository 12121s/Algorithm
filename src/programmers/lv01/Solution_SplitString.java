package programmers.lv01;

import java.util.HashMap;
import java.util.Map;

class Solution_SplitString {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }

    public static int solution(String s) {
        int answer = 0;

        int xIndex = 0; // 기준 문자열(x) 위치
        int curIndex = xIndex + 1; // 기준 문자열과 비교할 다른 문자열 위치

        int xCount = 1; // 기준 문자열과 같은 문자열 갯수
        int anotherCount = 0; // 기준 문자열과 다른 문자열 갯수

        while (curIndex < s.length()) {
            char xChar = s.charAt(xIndex);
            char currentChar = s.charAt(curIndex);

            if (xChar == currentChar) xCount++; // x와 다음 문자열이 같으면 x 개수 증가
            else anotherCount++; // x와 다음 문자열이 다르면 다른 문자열 개수 증가

            // x 문자열의 갯수와 다른 문자열의 갯수가 같아지면 분해 갯수를 더해준다
            if (xCount == anotherCount) {
                answer++;

                // 기준 문자열 & 다른 문자열 위치 이동
                xIndex = curIndex + 1;
                curIndex = xIndex + 1;

                // 초기화
                xCount = 1;
                anotherCount = 0;
            } else // 다른 문자열 위치 이동
                curIndex++;
        }

        if (xIndex < s.length()) // 비교 과정에서 남은 문자열
            answer++;

        return answer;
    }

    public static int solutionByMap(String s) {
        int answer = 0;

        Map<Character, Integer> charMap = new HashMap<>(); // x 문자열과 갯수 맵
        int xIndex = 0; // 기준 문자열(x) 위치
        int anotherCount = 0; // 기준 문자열과 다른 문자열 갯수

        for (int i = 0; i < s.length(); i++) {
            char xChar = s.charAt(xIndex);
            char currentChar = s.charAt(i);

            if (charMap.containsKey(currentChar))
                charMap.merge(currentChar, 1, Integer::sum);
            else {
                if (charMap.isEmpty())
                    charMap.put(currentChar, 1);
                else anotherCount++;
            }

            if (charMap.getOrDefault(xChar, -1) == anotherCount) {
                answer++;

                // 기준 문자열 위치 이동
                xIndex = i + 1;

                // 초기화
                anotherCount = 0;
                charMap.clear();
            }
        }

        if (xIndex < s.length())
            answer++;

        return answer;
    }
}
