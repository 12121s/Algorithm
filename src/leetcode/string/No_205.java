package leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class No_205 {
    // 205. Isomorphic Strings
    // Given two strings s and t, determine if they are isomorphic.
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character while preserving the order of characters.
    // No two characters may map to the same character, but a character may map to itself.
    public static void main(String[] args) {
        No_205 q = new No_205();
        System.out.println(q.isIsomorphic("egg", "add"));
        System.out.println(q.isIsomorphic("foo", "bar"));
        System.out.println(q.isIsomorphic("paper", "title"));
        System.out.println(q.isIsomorphic("leet", "code"));
    }

    /* result
    * Runtime: 15 ms, faster than 68.32% of Java online submissions for Isomorphic Strings.
    * Memory Usage: 45.4 MB, less than 11.09% of Java online submissions for Isomorphic Strings.
    * */
    public boolean isIsomorphic(String s, String t) {
        boolean isIsomorphic = true;
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        HashMap<Character, Integer> s_hashMap = new HashMap<>();
        HashMap<Character, Integer> t_hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            s_hashMap.putIfAbsent(s_arr[i], i);
            t_hashMap.putIfAbsent(t_arr[i], i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (isIsomorphic)
                isIsomorphic = Objects.equals(s_hashMap.get(s_arr[i]), t_hashMap.get(t_arr[i]));
        }
        return isIsomorphic;
    }
    /* result
     * Runtime: 15 ms, faster than 68.32% of Java online submissions for Isomorphic Strings.
     * Memory Usage: 43.1 MB, less than 42.53% of Java online submissions for Isomorphic Strings.
     * */
    public static boolean is_Isomorphic(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length())
            return false;
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char_str1 = str1.charAt(i), char_str2 = str2.charAt(i);
            if (map.containsKey(char_str1))
            {
                if (map.get(char_str1) != char_str2)
                    return false;
            }
            else
            {
                if (map.containsValue(char_str2))
                    return false;
                map.put(char_str1, char_str2);
            }
        }

        return true;
    }

    /* result
     * Runtime: 3 ms, faster than 99.59% of Java online submissions for Isomorphic Strings.
     * Memory Usage: 43.3 MB, less than 34.69% of Java online submissions for Isomorphic Strings.
     * */
    public boolean isArrIsomorphic(String sString, String tString) {

        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();

        int length = s.length;
        if(length != t.length) return false;
        //ASCII 문자 256을 담을 수 있는 char array
        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = s[i];
            char tc = t[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                //없는 문자라면 문자 ASCII 번호를 index 로 하는 배열에 char 을 저장
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                //있는 문자라면
                if(sm[sc] != tc || tm[tc] != sc){
                    //s와 t 서로 다른 대응되는 문자가 있을 경우
                    return false;
                }
            }
        }
        return true;
    }
}
