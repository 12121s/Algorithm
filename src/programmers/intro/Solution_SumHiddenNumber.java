package programmers.intro;

import java.util.Arrays;

class Solution_SumHiddenNumber {
    public static void main(String[] args) {
        String sample01 = "aAb1B2cC34oOp";
        String sample02 = "1a2b3c4d123Z";
        String sample03 = "1a24b3c4d123Z";
        String sample04 = "1a024b3c4d123";
        System.out.println(solution(sample01));
        System.out.println(solution(sample02));
        System.out.println(solution(sample03));
        System.out.println(solution(sample04));
    }

    public static int solution(String my_string) {
        int answer = 0;
        int start, end = 0;
        boolean isNumber = false;
        while (end < my_string.length()) {
            isNumber = false;
            start = end;
            char c = my_string.charAt(start);
            while (Character.isDigit(c)) {
                end++;
                isNumber = true;
                if (end == my_string.length())
                    break;
                c = my_string.charAt(end);
            }
            if (isNumber)
                answer += Integer.parseInt(my_string.substring(start, end));
            else end++;
        }
        return answer;
    }
}
