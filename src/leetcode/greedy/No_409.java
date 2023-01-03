package leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

public class No_409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("aaaccccdd"));
        System.out.println(longestPalindrome("aaabbbccccdd"));
        System.out.println(longestPalindrome("abzxccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("ccc"));
    }

    public static int longestPalindrome(String s) {
        int answer = 0;
        boolean hasSingleLetter = false;

        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter : s.toCharArray()) {
            letterCount.merge(letter, 1, Integer::sum);
        }

        for (char letter : letterCount.keySet()) {
            int count = letterCount.get(letter);
            if (count % 2 == 0) answer += count;
            else {
                hasSingleLetter = true;
                answer += (count - 1);
            }
        }

        if (hasSingleLetter)
            answer++;

        return answer;
    }
}
