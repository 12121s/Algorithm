package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class No_5597 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<String> arrList = IntStream.rangeClosed(1, 30)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.toList());

            for (int i = 0; i < 28; i++) {
                arrList.remove(br.readLine());
            }

            for (String s : arrList) {
                System.out.println(s);
            }

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
