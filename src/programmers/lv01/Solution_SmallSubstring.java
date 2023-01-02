package programmers.lv01;

class Solution_SmallSubstring {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String subNumber = t.substring(i, p.length() + i);
            if (Long.parseLong(subNumber) <= Long.parseLong(p))
                answer++;
        }

        return answer;
    }
}
