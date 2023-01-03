package programmers.lv01;

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
        String[][] type = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        String answer = "";

        for (int i = 0; i < choices.length; i++) {

        }

        return answer;
    }
}
