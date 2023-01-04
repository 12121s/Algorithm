package programmers.lv01;

import java.util.HashMap;
import java.util.Map;

class Solution_PersonalityType {
    public static void main(String[] args) {
        String[] sample1_1 = new String[] {"AN", "CF", "MJ", "RT", "NA"};
        int[] sample1_2 = new int[] {5, 3, 2, 7, 5};
        String[] sample2_1 = new String[] {"TR", "RT", "TR"};
        int[] sample2_2 = new int[] {7, 1, 3};

        System.out.println(solution(sample1_1, sample1_2));
        System.out.println(solution(sample2_1, sample2_2));
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> typeScore = new HashMap<>(Map.of(
                "R", 0, "T", 0,
                "C", 0, "F", 0,
                "J", 0, "M", 0,
                "A", 0, "N", 0));

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) { // 비동의 관련 선택 -> survey의 첫번째 캐릭터에 점수
                typeScore.merge(survey[i].substring(0, 1), 4 - choices[i], Integer::sum);
            } else { // 모르겠음 & 동의 관련 선택 -> survey의 두번째 캐릭터에 점수
                typeScore.merge(survey[i].substring(1), choices[i] % 4, Integer::sum);
            }
        }

        System.out.println(typeScore.toString());

        answer.append(typeScore.get("R") >= typeScore.get("T")? "R": "T");
        answer.append(typeScore.get("C") >= typeScore.get("F")? "C": "F");
        answer.append(typeScore.get("J") >= typeScore.get("M")? "J": "M");
        answer.append(typeScore.get("A") >= typeScore.get("N")? "A": "N");

        return answer.toString();
    }
}
