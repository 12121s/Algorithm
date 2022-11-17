package baekjoon.level03;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class QuickPlusTable2 {
    public static void printResult() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            }

            bw.flush();

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printResultBuilder() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                sb.append("Case #")
                        .append(i)
                        .append(": ")
                        .append(first)
                        .append(" + ")
                        .append(second)
                        .append(" = ")
                        .append(first + second)
                        .append("\n");
            }
            System.out.println(sb);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printShortResult() throws IOException {
        int testCases = sumUntilNewLine();
        StringBuilder answer = new StringBuilder();
        while (testCases-- > 0) {
            answer.append(sumUntilNewLine()).append('\n');
        }
        System.out.print(answer.toString());
    }

    public static int sumUntilNewLine() throws IOException {
        int sum = 0;
        int buf = 0;
        int c;
        while((c = System.in.read()) != '\n') {
            if (c == ' ') {
                sum += buf;
                buf = 0;
            } else {
                buf = (buf * 10) +(c - '0');
            }
        }
        sum += buf;
        return sum;
    }
}
