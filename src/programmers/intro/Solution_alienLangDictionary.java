package programmers.intro;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Solution_alienLangDictionary {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
        System.out.println(solution(new String[]{"s", "o", "m"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic)
                .anyMatch(s -> Arrays.stream(spell)
                        .allMatch(s::contains))? 1 : 2;
    }
}
