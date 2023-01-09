package leetcode.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_2131 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome(new String[]{"lc","cl","gg"}));
        System.out.println(longestPalindrome(new String[]{"ab","ty","yt","lc","cl","ab"}));
        System.out.println(longestPalindrome(new String[]{"cc","ll","xx"}));
        System.out.println(longestPalindrome(new String[]{"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"}));
        System.out.println(longestPalindrome(new String[]{"bb","bb"}));
    }

    public static int longestPalindrome(String[] words) {
        Map<String, List<String>> matchWord = new HashMap<>();
        boolean isSameChar = false;
        int answer = 0;

        for (String word : words) {
            if (matchWord.get(word) != null) {
                answer += 2 * word.length();

                List<String> list = matchWord.get(word);
                if (list.size() > 1) {
                    list.remove(reverseString(word));
                    matchWord.put(word, list);
                } else matchWord.remove(word);
            } else {
                // 중복 키 처리
                String reverse = reverseString(word);
                List<String> list = matchWord.get(reverse);
                if (list == null)
                    list = new ArrayList<>();
                list.add(word);
                matchWord.put(reverse, list);

                if (!isSameChar) {
                    if (word.charAt(0) == word.charAt(1)) {
                        isSameChar = true;
                    }
                }
            }
        }

        if (isSameChar) {
            for (String k : matchWord.keySet()) {
                if (k.charAt(0) == k.charAt(1)) {
                    answer += 2;
                    break;
                }
            }
        }

        return answer;
    }

    /*public static int longestPalindrome(String[] words) {
        List<String> matchWord = new ArrayList<>();
        boolean isSameChar = false;
        int answer = 0;

        for (String word : words) {
            if (matchWord.contains(word)) {
                answer += 2 * word.length();
                matchWord.remove(word);
            } else {
                matchWord.add(reverseString(word));
                if (!isSameChar) {
                    if (word.charAt(0) == word.charAt(1)) {
                        isSameChar = true;
                    }
                }
            }
        }

        if (isSameChar) {
            for (String k : matchWord) {
                if (k.charAt(0) == k.charAt(1)) {
                    answer += 2;
                    break;
                }
            }
        }

        return answer;
    }*/

    public static String reverseString(String word) {
        StringBuilder reverse = new StringBuilder();

        int i = 0;
        while (i < word.length()) {
            reverse.append(word.charAt(word.length() - 1 - i));
            i++;
        }

        return reverse.toString();
    }
}
