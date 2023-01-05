package leetcode.string;

public class No_14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"c","acc","ccc"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();

        // 1. 가장 짧은 길이의 문자를 찾는다. -> 찾을 필요 없이 제일 첫번째 문자열 갯수를 기준으로 해도 될듯. 길이 초과하면 끝내면 됨.
        for (int i = 0; i < strs[0].length(); i++) {
            boolean isEqualStr = false;
            char compareChar = strs[0].toCharArray()[i];

            for (String str : strs) {
                if (i >= str.length()) {
                    isEqualStr = false;
                    break;
                }
                char currChar = str.toCharArray()[i];
                // 2. 주어진 문자열 배열의 모든 문자열을 한글자 씩 같은 문자인지 비교한다.
                isEqualStr = compareChar == currChar;
                if (!isEqualStr) break;
            }
            // 3. 한 문자라도 동일하지 않으면 결과 리턴
            if (isEqualStr)
                answer.append(strs[0].toCharArray()[i]);
            else break;
        }

        return answer.toString();
    }
}
